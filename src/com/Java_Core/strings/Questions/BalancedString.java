package com.Java_Core.strings.Questions;

import java.util.List;
import java.util.Stack;

class BalancedString {
	public static void main(String[] args) {
	    String s = "{{}[](0)abc#()}";
		System.out.println (isBalanced(s));

	}
	static boolean isBalanced(String s){
		s = removeChar(s);
		while (s.contains ("[]")|| s.contains("{}")||s.contains("()")){
			s = s.replace ("{}","");
			s = s.replace ("[]","");
			s = s.replace ("()","");
		}
		return s.isEmpty ();
	}

	static String removeChar(String s){
		int i =0;
		String s2 = "";
		while (i<s.length()){
			char ch = s.charAt (i);
			if (ch == '('||ch == ')'||ch == '{'||ch == '}'||ch == '['||ch == ']'){
				s2+=ch;
			}
			i++;

		}
		System.out.println (s2);
		return s2;
	}


}
