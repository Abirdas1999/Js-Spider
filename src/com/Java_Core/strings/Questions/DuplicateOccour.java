package com.Java_Core.strings.Questions;

import java.util.Arrays;

class DuplicateOccour {
	public static void main (String[] args) {
		String s = "hello world";

		getString (s);
	}

	static void getString (String st) {
		char[] s = st.toCharArray ();
		String s2 = "";
		for (int i = 0; i < s.length; i++) {
			boolean flag = false;
			if (s[i] == ' ' || s[i] >= '0' && s[i] <= '9') continue;
			char count = '1';
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					count++;
					s[j] = count;
					flag = true;
				}
			}
			if (flag){
				s[i] = '1';
			}
		}
		System.out.println (s);
	}

}
