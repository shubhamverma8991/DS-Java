package com.cdac;

public class StackLL {
	private Node top;
	public StackLL()
	{
		top = null;
	}
	public void push(int element)
	{
		Node temp = new Node();
		temp.setInfo(element);
		if (top == null)
		{
			top = temp;
		}
		else
		{
			temp.setNext(top);
			top = temp;
		}
	}
	
	public int pop()
	{
		if (top == null)
			throw new RuntimeException("Empty stack.");
		else
		{
			Node temp = top;
			top = top.getNext();
			return temp.getInfo();
		}
	}
}
