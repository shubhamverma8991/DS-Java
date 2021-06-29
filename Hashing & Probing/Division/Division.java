package div;

public class Division {
//divison hashing

	public int Divhashing(int value, int[] arr) {
		int size = arr.length;
		//int element = value;
		//int prime= prime(value);

		int index = value % size;
		return index;
	}

	
	public int linearProbing(int p)
	{
		
		return p;
	}
	
//	public int prime(int value) {
//		int count = 0, prime = 0, copyvalue = value, dig = 0, newvalue = 0, i = 0, count1 = 0;
//		if (count1 == 0) {
//			for (int j = 2; j <= value; j++) {
//				count = 0;
//				for (i = 2; i < j; i++) {
//					if (j % i == 0) {
//						count++;
//					}
//
//				}
//				if (count == 0) {
//					prime = j;
//					count1++;
//
//				}
//			}
//		}
//		dig = copyvalue % prime;
//		return (int)dig;
//	}
}
