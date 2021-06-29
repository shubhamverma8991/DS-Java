package com.selectsort;

public class Runner {

	public static void main(String[] args) {
		//int [ ]arr= {10,5,2,9,12,4,1,6};
		int [] arr = {12,3,8,5,1};
		SelectioSort ss =new SelectioSort();
		ss.SelectionSort(arr);
		System.out.println("After Selection Sort");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
