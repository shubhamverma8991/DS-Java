package adjacencymatrix;

public class Stack {
	private int top;
	private int[] arr;
	
	public Stack()
	{
		top=-1;
		arr = new int[5];
	}
	
	public Stack(int size)
	{
		top=-1;
		arr = new int[size];
	}
	
	public void push(int element)
	{
		if (isFull())
		{
			System.out.println("Stack is full. Cannot push an element.");
		}
		else
		{
			arr[++top] = element;
		}
	}
	
	public int pop()
	{
		if (isEmpty())
		{
			throw new RuntimeException();
		}
		else
		{//1
			return arr[top--];
		//0
		}
	}
	
	public int peek()
	{
		if (isEmpty())
		{
			throw new RuntimeException();
		}
		else
		{
			return arr[top];
		}
	}
	
	public boolean isFull()
	{
		return (top == arr.length-1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
}

