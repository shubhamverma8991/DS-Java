package com.linkedlist.getset;
public class LinkedList {

	Node head; // define head Node
	int count;

	public LinkedList() {
		super();
		this.head = null;
	}

	// insert at End
	public void insertAtEnd(int value) {
		Node node = new Node();
		node.setData(value); // add data at end
		node.setNext(null); //

		if (head == null) // what if head is full
		{
			head = node;
			count++;
		} else {
			Node n = head; // travel from head to tail
			while (n.getNext() != null) // checking for the null value
			{
				n = n.getNext();
			}
			n.setNext(node);
			count++;
		}
	}

	// Insert at First
	public void insertAtFirst(int value) {
		Node node = new Node();
		node.setData(value);
		node.setNext(null);

		node.setNext(head);
		head = node;
		count++;
	}

	// Insert at certain Point
	public void insert(int index, int value) {
		if (index == 0 ) {
			insertAtFirst(value);
			count++;
		} else {
			Node node = new Node();
			node.setData(value);
			node.setNext(null);

			Node n = head;
			for (int i = 0; i < index-1 ; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
			count++;
		}
	}

//to delete an element
	public void deleteAt(int index) {
		Node n = head;
		Node n1 = null;
		if (index == 0) {
			head = head.getNext();
			n1 = null; // marked for GC
			count--;
		} else if (index <= count) {

			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
			n1 = null; // marked for GC
			count++;
		} else
			throw new RuntimeException("Invalid Index");
	}

	//insert item after
	public void insertAfter(int value, int after)
	{
		 Node temp = new Node();
		 temp.setData(value);
		 Node curr=head;
		
		while((curr!=null) && (curr.getData()!=after))
			curr=curr.getNext();
		if(curr!=null)
		{
			temp.setNext(curr.getNext());
			curr.setNext(temp);	
		}
		else
		{
			System.out.println("node with element  "+ after+" does not exist ");
		}
	}
	
	// Display or Show
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}

	}

}
