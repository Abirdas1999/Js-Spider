package com.PractiseAll.Set3;

public class BalnacedString {
	public static void main (String[] args) {
		String s = "()af{}{({})}";
		System.out.println (isBalanced (s));
	}

	static boolean isBalanced (String s) {
		String s2 = getString (s);

		char[] arr = s2.toCharArray ();
		char[] newArr = new char[arr.length];
		int top = -1;

		for (char c : arr) {

			if (c == '(' || c == '{' || c == '[') {
				newArr[++top] = c;
			} else {
				if (top == -1) return false;

				char last = newArr[top--];

				if ((c == ')' && last != '(') ||
						(c == '}' && last != '{') ||
						(c == ']' && last != '[')) {
					return false;
				}
			}
		}

		return top == -1;
	}

	static String getString (String s) {
		String s2 = "";
		char[] a = s.toCharArray ();
		for (char c : a) {
			if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']') {
				s2 += c;
			}
		}
		return s2;
	}
//	static String getString(String s){
//		String s2 = "";
//		String reg = "[{}()\\[\\]]";
//		for (int i = 0;i<s.length();i++){
//			if (String.valueOf(s.charAt(i)).matches(reg)) {
//				s2+=s.charAt (i);
//			}
//		}
//		return s2;
//	}


}
