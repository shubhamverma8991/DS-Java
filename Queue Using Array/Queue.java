package com.queue;

public class Queue {
	private int count;
	private int[] arr ;
	private int size,front, rear;

	public Queue(int size) {
		this.size = size;
		arr=new int[size];
		rear = 0;
		front = 0;
	}

	public void enQueue(int value) {
		arr[rear] = value;
		rear++;
		count++;
	}

	public int deQueue() {
		int data = arr[front];
		front++;
		count--;
		return data;

	}

	public void show() {
		System.out.println("Elements :");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
