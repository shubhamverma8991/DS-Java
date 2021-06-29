package div;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d = new Division();
		Scanner sc=new Scanner(System.in);
		int element,hashcode;
		int[] arr = new int[7];
		for (int i=1;i<=5;i++)
		{
			element = sc.nextInt();
			hashcode = d.Divhashing(element,arr);
			//System.out.println("Hash Code = " + hashCode);
		
			if (arr[hashcode]==0) // Array index is vacant
			{
				arr[hashcode] = element;
			}
			else  // If not zero, then element already exists.
			{
				//**************linearProbing**************//
				System.out.println("Collision for element number " + i);
				int p=1;
				int lp;
				int newHash;
				do {
					lp=d.linearProbing(p);
					newHash = (hashcode + lp)%100;
					if(arr[newHash]==0)
					{
						arr[newHash]=element;
						break;
					}
					p++;
				}while(true);
			}
		
		}	
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=0)
			{
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
	}

}
