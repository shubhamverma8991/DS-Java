package com.bubble;

public class Runner {

	public static void main(String[] args) {
	
		int []arr= {5,8,4,2,1};
		BubbleSort ba = new BubbleSort();
		ba.Sort(arr);
		//ba.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
