package com.PractiseAll.Set1;

class LongestSubPalindrome {
	public static void main (String[] args) {
		String s = "malayalam";
//		System.out.println (getSubString(s));
		getSubString2 (s, 0, 1);

	}

	static String getSubString (String s) {
		String s2 = "";
		return s;
	}

	static void getSubString2 (String s, int st, int ed) {
		if (st == s.length ()) {
			return;
		}
		if (ed > s.length()) {
			getSubString2(s, st + 1, st + 1);
			return;
		}
		String s2 = s.substring (st, ed);
		if (isPalindrome (s2)) {
			System.out.println (s2);
		}
		getSubString2 (s,st,ed+1);

	}


	static boolean isPalindrome (String s) {
		String s2 = "";
		for (int i = s.length ()-1; i >= 0; i--) {
			s2 += s.charAt (i);
		}
		return s.equals (s2);
	}

}
