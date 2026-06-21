package com.Exam.String;

class Reverse2 {
	public static void main(String[] args) {
	    String s = "Java is easy";
		String s2 = "";
		char [] arr = s.toCharArray ();
		for (int i = arr.length-1; i >=0 ; i--) {
			s2+=arr[i];
		}
		System.out.println (s2);
	}
}
