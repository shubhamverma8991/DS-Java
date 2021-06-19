package com.linkedlist.getset;

public class Node {
	private int data;
	private Node next;

//default
	public Node() {
		data = 0;
		next = null;
	}

//para const
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

//getter setter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

//getter setter
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
