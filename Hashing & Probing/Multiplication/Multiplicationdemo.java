package hashing;

public class Multiplicationdemo {

	public static void main(String[] args) {
		//System.out.println(Math.random());
		Multiplication mm = new Multiplication();
		int[] arr = new int[100];
		double c=0.496235;
		mm.calculation(16,c, arr);
		mm.calculation(666,c, arr);
		mm.calculation(166,c, arr);
		mm.calculation(200,c, arr);
		//mm.calculation(200,c, arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println("Element " + arr[i] + " at index " + i);
		}
	}

}
