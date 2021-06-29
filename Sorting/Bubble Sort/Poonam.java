package com.bubble;

public class Poonam {
	public static void main(String[] args) {
		int[] arr= {5,8,4,2,1};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

	}