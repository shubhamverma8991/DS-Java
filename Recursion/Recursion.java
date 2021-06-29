
public class Recursion {
	// Q1
	// recursive method to call factorial
	public int fact(int i) {
		if (i == 0) {
			return 1;
		} else
			return i * fact(i - 1);
	}

	// Q2
	// recursive method to call fibonnaci series
	public int fibo(int n) {
		if (n <= 2)
			return (n - 1);
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	// Q3
	// Print a Series of Number
	public void series(int n) {
		if (n == 0)
			System.out.println(n);
		else if (n > 0) {
			series(n - 1);
			System.out.print(n + " ");
		} else
			System.out.println("Enter Positive Number");
	}
	
	//Q4
	//Tower of Hanoi
	public void toh(int n, String src,String trg , String aux)
	{
		if(n==0)
			return;
		else {
			toh(n-1,src,aux,trg);
			
			System.out.println("MoveDisk "+n+" from "+src+" to "+trg);
			
			toh(n-1,aux,trg,src);
		}
	}

	public static void main(String[] args) {
		Recursion rr = new Recursion();
		// Q1
		// for factorial
		System.out.println("Factorial");
		System.out.println(rr.fact(10));

		// Q2
		// for fibonnaci series
		System.out.println("Fibonnaci Series");
		for (int n = 1; n <= 10; n++) {
			System.out.print(rr.fibo(n) + " ");
		}
		System.out.println();

		// Q3
		// print Number Series
		System.out.println("Number Series ");
		rr.series(15);
		System.out.println();
		System.out.println();
		
		//Q4
		//tower of Hanoi
		System.out.println("Tower of Hanoi");
		System.out.println("Moving 3 disk");
		rr.toh(4, "A", "C", "B");
	}
}
