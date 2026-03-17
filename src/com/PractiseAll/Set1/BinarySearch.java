package com.PractiseAll.Set1;

import java.util.Arrays;

class BinarySearch {
	public static void main (String[] args) {
		int[] a = {2, 5, 1, 8, 9, 3, 0};
		Arrays.sort (a);
		System.out.println (Arrays.toString (a));
		System.out.println (BSearch (a, 0, a.length - 1, 3));
	}

	static int BSearch (int[] a, int st, int ed, int key) {
		if (st > ed) return -1;
		int md = (st + ed) / 2;

		if (a[md] == key) return md;
		else if (a[md] < key) {
			return BSearch (a, (st = md + 1), ed, key);
		} else {
			return BSearch (a, st, (ed = md - 1), key);
		}
	}
}
