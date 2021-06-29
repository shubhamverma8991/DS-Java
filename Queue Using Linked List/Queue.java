package com.cdac;

public class Queue {
	private Node front;
	private Node rear;
	public Queue()
	{
		front = null;
		rear = null;
	}

	public void enqueue(int element)
	{
		Node temp=new Node();
		temp.setInfo(element);
		if(rear==null)
		{
			front=rear=temp;
		}
		else
		{
			rear.setNext(temp);
			rear=temp;
		}
	}
	
	public int dequeue()
	{
		if(front==null)
		{
			throw new RuntimeException("Queue is empty.");
		}
		else
		{
			int value;
			if(front==rear)
			{
				value=front.getInfo();
				front=null;
				rear=null;
				return value;
			}
			else
			{
				Node temp;
				temp=front;
				front=front.getNext();
				value=temp.getInfo();
				return value;
			}
		}
	}

}
