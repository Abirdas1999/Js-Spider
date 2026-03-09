package com.Java_Core.ZZpractise;

class SubstringPalindrome {
		static String bigSub = "";
	public static void main (String[] args) {
		String s = "malayalamffwe";
		getSubString (s, 0, s.length ());
		System.out.println (bigSub);
	}

	static void getSubString (String s, int st, int ed) {
		if (st == ed) {
			return;
		}
		for (int i = st+1; i <= ed; i++) {
			String s2 = s.substring (st,i);
			if (isPalindrome (s2) && s2.length ()>bigSub.length ()) bigSub = s2;
		}
		getSubString (s, st + 1, ed);
	}

	static boolean isPalindrome (String s) {
		String temp = "";
		int i = s.length () - 1;
		while (i >= 0) {
			temp += s.charAt (i);
			i--;
		}
		return s.equals (temp);
	}

}
