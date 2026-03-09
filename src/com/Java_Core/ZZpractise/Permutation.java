package com.Java_Core.ZZpractise;

class Permutation {
	public static void main (String[] args) {
		String s = "abc";
		getPermutation (s, 0, s.length ());
	}

	static void getPermutation (String s, int st, int ed) {
		if (st == ed){
			System.out.println (s);
			return;
		}
		for (int i = st; i < ed; i++) {
			s = getSwap (s, st, i);
			getPermutation (s, st + 1, ed);
		}
	}

	static String getSwap (String s, int i, int j) {
		char[] a = s.toCharArray ();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String (a);
	}


}
