package com.PractiseAll.Set1;

import java.util.Arrays;

class RotateArray {
	public static void main (String[] args) {
		int[] a = {2, 4, 1, 7, 6, 9, 3};//[6,9,3<>,2,4,1,7]
		doRotate (a, 4);
	}

	static void doRotate (int[] a, int key) {
		key = key % a.length;
		int k = 0;
		int index = a.length - key;
		int[] arr = new int[a.length];

		//right
		for (int i = index; i < a.length; i++) {
			arr[k++] = a[i];
		}
		//left
		for (int i = 0; i < index; i++) {
			arr[k++] = a[i];
		}
		System.out.println (Arrays.toString (arr));
	}


}
