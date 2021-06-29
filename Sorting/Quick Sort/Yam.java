package QuickSort;

public class Yam {
	int m=0;
	public void quickSort(int[] a,int p,int q)
	{
		//System.out.println("afsg");
		//if(p==q)
           //System.out.println("Only one element in array");
		if(p<q)
		{
			
			m=partition(a,p,q);  //array =O(n)
			quickSort(a,p,m-1);  //array =T(n/2)
			quickSort(a,m+1,q); 	//array =T(n/2)         
			//best case//2*T(n/2)+O(n)   = O(n*log n)
			/*
			 * 	m=partition(a,p,q);  //array =O(n)
			quickSort(a,p,m-1);  //array =T(n-1)
			quickSort(a,m+1,q); 	//array =T(0)
			o(n) + T(n-1)=O(n^2)
			 */
		}
	}
	public int partition(int[] a,int p,int q)
	{
		int x=a[p];
		int i=p;
		for(int j=p+1;j<=q;j++)
		{
			if(a[j]<=x)
			{
				i=i+1;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}			
		}
		int temp=0;
		temp=a[p];
		a[p]=a[i];
		a[i]=temp;
		return i;
	}
	//public void swap(int a,int b)
//	{
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a = {10,34,23,14,87,30,23};
          Yam qs=new Yam();
          int p=0;
          
           int q=(a.length-1);
          System.out.println("Array before QuickSorting");
          for(int i:a)
          {
        	  System.out.print(i+" ");
          }
          System.out.println();
          qs.quickSort(a, p, q);
          System.out.println("Array after QuickSorting");
          for(int i:a)
          {
        	  System.out.print(i+" ");
          }
	}

}
