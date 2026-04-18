package com.PractiseAll.Set1;

import java.util.Arrays;

class SelectionSort {
	public static void main (String[] args) {
		int[] a = {2, 3, 4, 7, 0, 1};
		SelSort (a);
		System.out.println (Arrays.toString (a));
	}

	static void SelSort (int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i-1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;


		}
	}
}
