package Stack;

public class Stack {
	// int size =5;
	int[] stack = new int[5]; // array with fixed size
	int top = -1;

	public void push(int data) // to add data
	{
		if (isFull()) {
			System.out.println("Stack is Full");
		} 
		else {
			stack[++top] = data;
		}
	}

	public int pop() throws StackException // to remove data
	{
		if(isEmpty())
		{
			throw new StackException("Empty Stack");
		}
		else {
		int data;
		data = stack[top];
		stack[top] = 0;
		top--;
		return data;
		}
	}

	public int peek() // to see the last added data
	{
		int data;
		data = stack[top];
		return data;
	}

	public void show() // display all data
	{
		for (int n : stack) {
			System.out.println(n);
		}
	}

	public int size()
	{
		return top;
	}
	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}
