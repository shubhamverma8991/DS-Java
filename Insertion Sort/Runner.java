package com.insertsort;

public class Runner {

	public static void main(String[] args) {
		int [] arr= {100,90,80,101,55,20,5,110};
		InsertionSort is =new InsertionSort();
		is.InsertionSortmethod(arr);
		System.out.println("After Insertion Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
