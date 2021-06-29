package com.insertsort;

public class InsertionSort {

	public void InsertionSortmethod(int[] arr) {
		int i, j;
		int temp;
		for (i = 0; i < arr.length; i++) {
			temp=arr[i];
			for (j = i; j > 0 && temp < arr[j - 1]; j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}

}
