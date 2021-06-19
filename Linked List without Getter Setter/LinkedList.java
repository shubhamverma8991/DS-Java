package com.linkedlist;

public class LinkedList {

	Node head; //define head Node
	
	//insert at End
	public void insertAtEnd(int value)
	{
		Node node = new Node();
		node.data=value;    //add data at end
		node.next=null;     //
		if(head==null)    //what if head is full
		{
			head=node;
		}
		else
		{
			Node n = head; //travel from head to tail
			while(n.next!=null)  //checking for the null value
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	//Insert at First
	public void insertAtFirst(int value)
	{
		Node node = new Node();
		node.data=value;
		node.next=null;
		
		node.next=head;
		head = node;
	}
	
	//Insert at certain Point
	public void insert(int index,int value)
	{
		if(index==0)
		{
			insertAtFirst(value);
		}else {
		Node node = new Node();
		node.data=value;
		node.next=null;
		
		Node n= head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	
	//delete at
	public void deleteAt(int index)
	{Node n =head;
	Node n1= null;
		if(index==0)
		{
			head=head.next;
			n1=null;
		}
		else {
			
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null; // marked for GC
		}
	}
	//Display or Show
	public void show()
	{ Node node =head;
		while(node.next!=null)
		{
			System.out.print(node.data+" ");
			node =node.next;
		}
		System.out.print(node.data+" ");
	}

	
}
