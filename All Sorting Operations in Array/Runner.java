package com.arraysearch;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
		int[] arr = { 100, 20, 90, 45, 65, 78, 21, 1, 45 };
		Array a = new Array();
		System.out.println("Before Sorting");
		a.Arraymethod(arr, x);
		System.out.println("After Insertion Sort");
		a.InsertionSort(arr);
												//		for(int i=0;i<arr.length;i++)
												//			System.out.println(arr[i]);
		a.Arraymethod(arr, x);

		System.out.println("After Selection Sorting");
		a.SearchingSort(arr);
		a.Arraymethod(arr, x);
		
		sc.close();
	}

}
