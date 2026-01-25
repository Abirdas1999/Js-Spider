package com.Java_Core.strings.Questions;

import java.util.List;
import java.util.Stack;

class BalancedStringCollection {
	public static void main(String[] args) {
		String s = "{{}[](0)abc#()}";
		System.out.println (isBalancedColl(s));

	}
	static boolean isBalancedColl(String s){
		Stack<Character> l = new Stack<> ();
		for (int i = 0; i <s.length () ; i++) {
			if (s.charAt (i) == '('||s.charAt (i) == '{'||s.charAt (i) == '['){
				l.push (s.charAt (i));
			} else if (s.charAt (i) == ')'||s.charAt (i) == '}'||s.charAt (i) == ']') {

				if (!isPair (l.pop (),s.charAt (i)))return false;

			}
		}

		return l.isEmpty ();
	}

	static boolean isPair (char c1, char c2) {
		if (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']') {
			return true;
		}
		return false;
	}

}
