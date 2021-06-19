package Stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("After Pushing 4 Values");
		s.show();

		System.out.println("After Poping 5 Values");
		try {
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
		} catch (StackException e) {
			System.out.println(e.getMessage());}
		s.show();
	}

}
