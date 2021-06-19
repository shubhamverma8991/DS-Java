package com.linkedlist;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtEnd(5);
		list.insertAtEnd(12);
		list.insertAtEnd(6);

		System.out.println("Without Changes");
		list.show();
		System.out.println();
		System.out.println();
		
		list.insertAtFirst(200);
		System.out.println("After Insert at First");
		list.show();
		System.out.println();
		System.out.println();
		
		System.out.println("After Insertion at index 2");
		list.insert(2, 500);
		list.show();
		System.out.println();
		System.out.println();
		
		System.out.println("After Insertion 1500 at index 0");
		list.insert(0, 1500);
		list.show();
		System.out.println();
		System.out.println();
		
		System.out.println("After Deletion at index 0");
		list.deleteAt(0);
		list.show();
		System.out.println();
		System.out.println();
	
		System.out.println("After Deletion at index 1");
		list.deleteAt(1);
		list.show();
	}

}
