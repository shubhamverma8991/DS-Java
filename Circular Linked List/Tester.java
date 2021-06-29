package com;

public class Tester {

	public static void main(String[] args) {
		CircularLL list = new CircularLL();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.traverse();
		System.out.println("After delete");
		System.out.println(list.deleteElementAtStart());
		System.out.println(list.deleteElementAtStart());
		System.out.println(list.deleteElementAtStart());
		System.out.println("Traversal after 3 deletion");
		list.traverse();
		System.out.println("Removal of last node");
		System.out.println(list.deleteElementAtStart());
		System.out.println("Traversal after removing all nodes");
		list.traverse();
		System.out.println("Removal on empty list");
		try {
			System.out.println(list.deleteElementAtStart());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
