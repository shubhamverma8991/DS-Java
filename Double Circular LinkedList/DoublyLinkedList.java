package com.cdac;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		tail = null;
	}

	public void insertAtEnd(int element) {
		Node temp = new Node();
		temp.setInfo(element);

		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
			tail.setPrev(tail);
		} else {
			// set temp's next to head
			temp.setNext(tail.getNext());
			// set temps prev to tail
			temp.setPrev(tail);
			// set head's prev to new last node
			tail.getNext().setPrev(temp);
			// set 2nd last node's next to last node(temp)
			tail.setNext(temp);
			tail = temp;
		}
	}

	public void insertAtFront(int element) {
		Node temp = new Node();
		temp.setInfo(element);

		if (head == null) {
			head = tail = temp;
		} else {
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
	}

	public void traverseForward() {
		Node curr = tail.getNext();
		System.out.println("Traverse forward");
		do {
			System.out.println(curr.getInfo());
			curr = curr.getNext();
		}while (curr != tail.getNext());
	}

	public void traverseBackward() {
		Node curr = tail;
		System.out.println("Traverse backward");
	do {
			System.out.println(curr.getInfo());
			curr = curr.getPrev();
		}	while (curr != tail);
	
	}
}
