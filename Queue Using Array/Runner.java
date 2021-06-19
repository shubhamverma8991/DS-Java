package com.queue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(100);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		
		q.show();
	}

}
