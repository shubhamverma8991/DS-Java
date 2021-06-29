package hashing;

public class DoubleHashing {

	public int multi(int value, double c, int[] arr) {
		int size = arr.length;
		double hash = value * c;
		hash = hash - (int) hash;
		int newhash = (int) Math.floor(hash * size);
		return newhash;
	}

	public int radix(int value, int[] arr) {
		int newhash = 0;
		int cpy = value;
		int dig;
		int i = 0;
		while (cpy > 0) {
			dig = cpy % 10;
			newhash = newhash + (int) Math.pow(13, i) * dig;
			i++;
			cpy = cpy / 10;
		}
		return newhash % (arr.length);
	}

	public int linearProbing(int p) {

		return p;
	}

//	public int QudraticProbing(int p) {
//		return p;
//	}

}
