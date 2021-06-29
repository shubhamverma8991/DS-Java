package com.cdac;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(23);
		q.enqueue(20);
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		q.enqueue(4);
		q.enqueue(58);
		q.enqueue(16);
		q.enqueue(70);
		q.enqueue(42);
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
	}
}
