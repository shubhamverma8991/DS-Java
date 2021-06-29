package com;

public class CircularLL {
	private Node tail;
	public CircularLL()
	{
		tail = null;
	}
	
	public void insertAtEnd(int element)
	{
		Node temp = new Node();
		temp.setInfo(element);
		if (tail == null)
		{
			tail = temp;
			tail.setNext(tail);
		}
		else
		{
			// temp's next will store the ref. of head (tail.getNext())
			temp.setNext(tail.getNext());
			// Link existing tail with temp
			tail.setNext(temp);
			// tail will now store the reference of new node that is added
			// at the end.
			tail = temp;
		}
	}
	
	public void traverse()
	{
		if (tail != null)
		{
			Node curr=tail.getNext();
			do
			{
				System.out.println(curr.getInfo());
				curr=curr.getNext();
			}while(curr!=tail.getNext());
		}
		else
		{
			System.out.println("List is empty");
		}
	}
	public int deleteElementAtStart()
	{
		Node curr=null;
		// If list is empty
		if (tail == null)
		{
			throw new RuntimeException("Empty list");
		}
		// If only 1 node
		else if(tail.getNext()==tail)
		{
			curr = tail.getNext();
			tail = null;
			return curr.getInfo();
		}
		// If more than 1 node exists
		else
		{
			curr = tail.getNext();
			tail.setNext(curr.getNext());
			return curr.getInfo();
		}
	}
}
