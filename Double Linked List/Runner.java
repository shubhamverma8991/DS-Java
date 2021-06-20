package com.cdac;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoublyLinkedList dll = new DoublyLinkedList();
dll.insertAtEnd(10);
dll.insertAtEnd(20);
dll.insertAtEnd(30);
dll.insertAtEnd(40);
dll.insertAtEnd(50);
dll.insertAtFront(100);
dll.traverseForward();

System.out.println();
//System.out.println("After Deletion");
//dll.deleteFirst();
//dll.traverseForward();
dll.traverseBackward();
	}

}
