package com.Java_Core.strings.Questions;

import java.util.LinkedHashSet;
import java.util.Set;

class SubStringPalindrome {
	public static void main(String[] args) {
		String s = "asmalayalamdsa";
		getSub(s);
	}
	static void getSub(String s){
		Set<String> st = new LinkedHashSet<> ();
		char [] s1 = s.toCharArray ();
		for (int i = 0; i <s1.length ; i++) {
			String temp = "";
			temp+=s1[i];
			st.add (temp);
			for (int j = i+1; j <s1.length ; j++) {
				temp+=s1[j];
				if (isPalindrome (temp)) st.add (temp);
			}
		}
		st.forEach ((x)-> System.out.println (x));
	}
	static boolean isPalindrome(String s){
		String temp ="";
		for (int i = s.length ()-1; i >=0 ; i--) {
			temp+=s.charAt (i);
		}
		return temp.equals (s);
	}
}
