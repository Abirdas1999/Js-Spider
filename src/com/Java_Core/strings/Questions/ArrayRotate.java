package com.Java_Core.strings.Questions;

class ArrayRotate {
	public static void main(String[] args) {
		String s1 = "abir";
		String s2 = "rabi";
//		System.out.println (s1.equals (s2));
		System.out.println (areRotations(s1,s2));
	}
		static boolean areRotations(String s1,String s2){
			if (s1.length () != s2.length ()) return false;
			char [] c1 = s1.toCharArray ();
			char [] c2 = s2.toCharArray ();
			for (int i = 0; i <c2.length; i++) {
				String temp ="";
				char d = c2[c2.length-1];

			}
			return true;
		}
}
