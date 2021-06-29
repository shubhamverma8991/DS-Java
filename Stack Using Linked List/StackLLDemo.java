package com.cdac;

public class StackLLDemo {

	public static void main(String[] args) {
		StackLL st = new StackLL();
		st.push(95);
		st.push(10);
		st.push(56);
		st.push(15);
		st.push(20);
		try {
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
