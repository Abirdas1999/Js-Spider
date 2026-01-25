package com.Java_Core.strings.Questions;

class UnicChar {
	public static void main(String[] args) {
		String s = "javavj";
		System.out.println (getUnic(s));
	}
	static String getUnic(String s){
		String s2 = "";
		boolean flag;
		s2+=s.charAt (0);
		for (int i = 0; i < s.length (); i++) {
			flag = false;
			for (int j = 0; j <s2.length () ; j++) {
				if (s.charAt (i) == s2.charAt (j)) {
					flag = true;
					break;
				}
			}
			if (!flag)s2+=s.charAt (i);
		}
		return s2;
	}


}
