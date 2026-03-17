package com.PractiseAll.Set1;

import java.util.List;
import java.util.Stack;

class BalancedString {
	public static void main (String[] args) {
		String s = "[])";
		System.out.println (getBalanced (s));
		System.out.println (newString (s));
	}

	static boolean getBalanced (String s) {
		String s2 = s.replaceAll ("[^{}()\\[\\]]", "");
		Stack<Character> l = new Stack<> ();
		for (int i = 0; i < s2.length (); i++) {
			char temp = s2.charAt (i);
			if (temp == '(' || temp == '[' || temp == '{') {
				l.push (temp);
			} else {
				if (l.isEmpty ())
					return false;
				char top = l.pop ();
				if ((temp == ')' && top != '(') ||
						(temp == ']' && top != '[') ||
						(temp == '}' && top != '{')) {
					return false;
				}
			}
		}
		return l.isEmpty ();
	}

	static String newString (String s) {
		String s2 = "";
		String regex = "[{}()\\[\\]]";
		for (int i = 0; i < s.length (); i++) {
			String ch = String.valueOf (s.charAt (i));
			if (ch.matches (regex)) {
				s2 += ch;
			}

		}
		return s2;
	}
}
