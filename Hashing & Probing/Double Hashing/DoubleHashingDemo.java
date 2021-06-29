package hashing;

import java.util.Scanner;

public class DoubleHashingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleHashing dh = new DoubleHashing();
		int[] arr = new int[100];
		double c = 0.496235;
		System.out.println("Enter Element");
		for (int i = 0; i < 5; i++) {
			int Element = sc.nextInt();
			int hash1 = dh.multi(Element, c, arr);
			// System.out.println(hash1);
			int hash2 = dh.radix(Element, arr);
			// System.out.println(hash2);
			int newhash = (hash1 + hash2) % 100;    //newhash = multihash + radixhash

			if (arr[newhash] == 0) {
				arr[newhash] = Element;
			} else {
				System.out.println("Collison Occur at " + i);
				int p = 1;
				int hashafterprobe;
				do {
					dh.linearProbing(p);
					hashafterprobe = (newhash + p) % arr.length;
					if (arr[hashafterprobe] == 0) {
						arr[hashafterprobe] = Element;
						break;
					}
					p++;
				} while (true);
			}

		}

		// ******Display******//
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println("arr[" + i + "] is " + arr[i]);
		}
		sc.close();
	}

}
