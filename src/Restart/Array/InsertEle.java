package Restart.Array;

import java.util.Scanner;

class InsertEle {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 89, 89, 46, 83};
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a number between 0 to array length : ");
		int index = sc.nextInt ();

		System.out.println ("Enter a element : ");
		int key = sc.nextInt ();
		for (int a : getnewArray (arr, index, key)) {
			System.out.print (a + " ");
		}

	}

	static int[] getnewArray (int[] arr, int i, int key) {
		if (i < 0 || i > arr.length) {
			throw new RuntimeException ("invalid number ! ...");
		}
		int[] a = new int[arr.length + 1];
		if (i == 0) {
			a[i++] = key;

			for (int j = 1; j < a.length; j++) {
				a[i++] = arr[j - 1];
			}
		} else if (i == arr.length) {
			for (int j = 0; j < arr.length; j++) {
				a[j] = arr[j];
			}
			a[i] = key;
		} else {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					a[i] = key;
				} else if (j < i) {
					a[j] = arr[j];
				} else {
					a[j] = arr[j - 1];
				}
			}
		}
		return a;
	}
}
