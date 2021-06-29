package com.cdac;

public class SortLinklist {
	private Node head;
	
	public SortLinklist()
	{
		head = null;
	}
	
	public void insertAtEnd(int element)
	{
		Node temp = new Node();
		temp.setInfo(element);
		
		if (head == null)
		{
			head = temp;
		}
		else if(element<head.getInfo())
		{
			temp.setNext(head);
			head=temp;
		}
		else
		{
			Node curr = head;
			Node prev=null;
			while ((curr!= null)&&(curr.getInfo()<element))
			{
				 prev=curr;
				curr = curr.getNext();
			}
				temp.setNext(curr);
				
			
			prev.setNext(temp);  
		}
	}	
	public void display()
	{
		Node curr = head;
		while (curr != null)
		{
			System.out.print(curr.getInfo()+"--->");
			curr = curr.getNext();
		}
	}

}
