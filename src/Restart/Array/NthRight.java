package Restart.Array;

import java.util.Scanner;

class NthRight {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 13};
		Scanner sc = new Scanner (System.in);
		System.out.print ("enter a how many times need rotate : ");
		int key = sc.nextInt ();
		for (int a : getRightRotate (arr, key)) {
			System.out.print (a + " ");
		}
	}

	static int[] getRightRotate (int[] arr, int key) {
		for (int i = 0; i < key; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length-1; j >0 ; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
}
