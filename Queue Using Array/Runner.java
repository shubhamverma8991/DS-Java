package com.cdac;

public class Runner {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);

			q.show();
			System.out.println();
			System.out.println("deQueue Elememts are : ");

			System.out.print(q.dequeue() + " ");
			System.out.print(q.dequeue() + " ");

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Remaining elements are:");
			q.show();

			q.enqueue(40);
			q.enqueue(50);
			q.enqueue(60);
			q.enqueue(70);
			q.enqueue(80);
			System.out.println("Show");
			q.show();
			// Empty all Queue

			while (!q.isEmpty()) {
				System.out.println(q.dequeue());
			}
			System.out.println("after Empty");
			q.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
