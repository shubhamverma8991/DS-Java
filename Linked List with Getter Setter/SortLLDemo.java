package com.cdac;

public class SortLLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortLinklist list = new SortLinklist();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(25);
		list.insertAtEnd(12);
		System.out.println();
		System.out.println("after sorting the list");
		list.display();
	}

}
