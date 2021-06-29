package com.arraysearch;

public class Array {
	public void Arraymethod(int[] arr, int x) {
		int flag = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println("Number is Present in Index " + i);
				flag=1;
				break;
			} else
				flag = 0;
		}
		if (flag == 0) {
			System.out.println("-1");
		}
	}
	
	//Insertion Sort
	public void InsertionSort(int[] arr) {
		int i, j, temp;
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i; j > 0 && temp < arr[j - 1]; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
	}
	
	//Searching Sort
	public void SearchingSort(int[] arr)
	{int i,j,smallestindex;
		for(i=0;i<arr.length-1;i++)
		{smallestindex=i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[smallestindex])
				{
					smallestindex=j;
				}
			}if (i != smallestindex)
				swap(arr, i, smallestindex);
		}
	}
	//Swap Function for Insertion Sort
	public void swap(int[] arr, int x, int y)
	{
		int temp =arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}
