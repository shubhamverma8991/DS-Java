package com.bubble;

public class BubbleSort {
//**Sir's Technique*****//
	public void Sort(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = arr.length - 1; j > i; j--) {
				if (arr[i] > arr[j]) {
					swap(arr, j, j - 1);
				}
			}
		}
	}

	public void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	// **********************Another Technique*************//
	void bubbleSort(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) { // swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// ****************************Another************************//
	void bubbles(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
