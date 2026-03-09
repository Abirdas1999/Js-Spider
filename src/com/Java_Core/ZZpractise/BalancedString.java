package com.Java_Core.ZZpractise;

class BalancedString {
	public static void main (String[] args) {
		String s = "{[df(ds)]}";
		String regex = "[^{}()\\[\\]]";
		System.out.println (getPanagram (s.replaceAll (regex, "")));
	}

	static boolean getPanagram (String s) {
		while (s.contains ("()") || s.contains ("{}") || s.contains ("[]")) {
			s = s.replace ("()", "");
			s = s.replace ("{}", "");
			s = s.replace ("[]]", "");
		}
			return s.length () == 0;
	}


}
