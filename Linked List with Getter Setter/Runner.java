package com.linkedlist.getset;

public class Runner {

	public static void main(String[] args) {
		try {

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

			System.out.println("After Insertion 500 at index 2");
			list.insert(2, 500);
			list.show();
			System.out.println();
			System.out.println();

			System.out.println("After Insertion 1500 at index 0");
			list.insert(0, 1500);
			list.show();
			System.out.println();
			System.out.println();
			
			System.out.println("After Insertion 1599 at index 1 ");
			list.insert(1, 1599);
			list.show();
			System.out.println();
			System.out.println();
			
			System.out.println("Inserting after 1500");
			list.insertAfter(2222, 1500);
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
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} // TODO Auto-generated method stub

	}

}
