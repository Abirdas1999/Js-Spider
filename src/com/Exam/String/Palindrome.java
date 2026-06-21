package com.Exam.String;

class Palindrome {
	public static void main(String[] args) {
	    String s ="madam";
		String s2 = "";

		for (int i =s.length ()-1; i >=0 ; i--) {
			s2+=s.charAt (i);
		}

//		System.out.println (s2==s);
//		System.out.println (s2.equals (s));
		if (s2.equals (s)){
			System.out.println ("Palindrome");
		}else {
			System.out.println ("Not a palindrome");
		}




	}

}
