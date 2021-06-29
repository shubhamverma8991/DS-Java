package hashing;

public class Multiplication {

	public void calculation(int element, double constant, int[] arr) {
		int Ele = element;
		int size = arr.length;
		double m = Ele * constant;
		m = m - (int) m;
		double index = Math.floor(m * size);
		arr[(int)index]=element;
		
		
	}
}
