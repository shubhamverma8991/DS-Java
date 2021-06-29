package com.selectsort;

public class SelectioSort {

	public void SelectionSort(int[] arr) {
		int i, j, smallestindex;
int count=0;
		for (i = 0; i < arr.length - 1; i++) 
		{
			smallestindex = i;
			for (j = i+1; j < arr.length; j++) 
			{count++;
				if (arr[j] < arr[smallestindex]) 
				{
					smallestindex = j;
				}
			}
			if(i!= smallestindex)
			swap(arr, i, smallestindex);
		}
	}

	public void swap(int[] arr, int x, int y) {
		int temp;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
