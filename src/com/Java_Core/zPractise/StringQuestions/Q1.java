package com.Java_Core.zPractise.StringQuestions;

class Q1 {
	public static void main(String[] args) {
	    String str = "JavaScript";
		String s2 = "";
		getReverse(str,s2);

	}
	static void getReverse(String str , String s){
		int i = str.length ()-1;
		while (i>=0){
			s+=str.charAt (i);
			i--;
		}
		System.out.println (s);
	}

}
