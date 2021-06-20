package com.cdac;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	int count;

	public DoublyLinkedList() {
		head = tail = null;
	}

	// Insert At End
	public void insertAtEnd(int element) {
		Node temp = new Node();
		temp.setInfo(element);

		if (head == null) {
			head = tail = temp;
			count++;
		} else {
			tail.setNext(temp); // temp ref set to tail
			temp.setPrev(tail); // in prev ref of temp .. tail is set
			tail = temp; // new tail created
			count++;
		}
	}

	// Insert At Front
	public void insertAtFront(int element) {
		Node temp = new Node();
		temp.setInfo(element);

		if (head == null) {
			head = tail = temp;
			count++;
		} else {
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
			count++;
		}
	}

	// Traverse-Travel Forward
	public void traverseForward() {
		if (isEmpty())
			throw new RuntimeException("No list");
		else {
			Node curr = head;
			System.out.println("Traverse forward");
			while (curr != null) {
				System.out.println(curr.getInfo());
				curr = curr.getNext();
			}
		}
	}

	// Traverse-Travel Backward
	public void traverseBackward() {
		if (isEmpty())
			throw new RuntimeException("No list");
		else {
			Node curr = tail;
			System.out.println("Traverse backward");
			while (curr != null) {
				System.out.println(curr.getInfo());
				curr = curr.getPrev();
			}
		}
	}

//	//Delete at First
//	public void deleteFirst() {
//		if(isEmpty())
//		{
//			throw new RuntimeException("Empty List");
//		}
//		
//		Node curr=head;
//		if(head==tail) {
//			tail=null;
//		}else
//		{
//			head.getNext();
//			head.setPrev(null);
//		}
//		head=head.getNext();
//		curr.setNext(null);
//		curr=null;
//		
//	}
//	// Delete at End
//	public void deleteAt(int index) {
//		Node curr = head;
//		Node n1 = null;
//		if (index == 0) {
//			head = head.getNext();
//			tail = tail.getPrev();
//			count--;
//		} else if (index <= count) {
//			for (int i = 0; i < index - 1; i++) {
//				curr = curr.getNext();
//			}
//			n1 = curr.getNext();
//			curr.setNext(n1.getNext());
//			n1 = null;
//		} else
//			throw new RuntimeException("Invalid Index");
//
//	}

	public boolean isEmpty() {
		if (count==0)
			return true;
		else
			return false;
	}

}
