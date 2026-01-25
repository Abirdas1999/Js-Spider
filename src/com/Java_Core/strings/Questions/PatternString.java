package com.Java_Core.strings.Questions;

class PatternString {
	public static void main(String[] args) {
	    String s = "jspider";
		getPrint(s);
	}
	static void getPrint(String s){
		for (int i = 0; i <s.length () ; i++) {
			for (int j = 0; j <=i ; j++) {
				System.out.print (s.charAt (j)+"\t");
			}
			System.out.println ();

		}
	}

}
