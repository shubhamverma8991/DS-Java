package hashing;

import java.util.Scanner;

public class HashinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		int element;
		System.out.println("Input 5 +ve integers of the array");
		Scanner sc = new Scanner(System.in);
		Hashing obj = new Hashing();
		//Hashing2 obj= new Hashing2();
		int hashCode;
		//linear Probing
		for (int i=1;i<=5;i++)
		{
			element = sc.nextInt();
			hashCode = obj.myHash(element);
			//System.out.println("Hash Code = " + hashCode);
		
			if (arr[hashCode]==0) // Array index is vacant
			{
				arr[hashCode] = element;
			}
//			else  // If not zero, then element already exists.
//			{
//				//**************linearProbing**************//
//				System.out.println("Collision for element number " + i);
//				int p=1;
//				int lp;
//				int newHash;
//				do {
//					lp=obj.linearProbing(p);
//					newHash = (hashCode + lp)%100;
//					if(arr[newHash]==0)
//					{
//						arr[newHash]=element;
//						break;
//					}
//					p++;
//				}while(true);
//			}
			else
			{
				//******quadratic probing*********//
				System.out.println("collison for element number "+i);
				int p =1;
				int lp;
				int newHash;
				do {
					lp=obj.QudraticProbing(p);
					newHash=(hashCode+lp+(lp*lp))%100;
					if(arr[newHash]==0)
					{
						arr[newHash]=element;
						break;
					}
					p++;
				}while(true);
			}
		}
		
		
		
		
		
		//print
		System.out.println("Non zero elements of the array are:");
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=0)
			{
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
		sc.close();
	}

}
