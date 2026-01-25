package com.Java_Core.strings.Questions;

class SmallestSubString {
	public static void main(String[] args) {
	    String s = "malayalamm";
		String smallest = s;
		System.out.println (getSmallestSub(s,smallest));
	}
	static String getSmallestSub(String s,String smallest){
		char [] s1 = s.toCharArray ();
		for (int i = 0; i <s1.length ; i++) {
			String temp = "";
			temp+=s1[i];
			for (int j = i+1; j <s1.length ; j++) {
				temp+=s1[j];
				if (isPalindrome (temp) && smallest.length ()>temp.length ()){
					smallest = temp;
				}
			}
		}
		return smallest;
	}
	static boolean isPalindrome(String s){
		String temp ="";
		for (int i = s.length ()-1; i >=0 ; i--) {
			temp+=s.charAt (i);
		}
		return temp.equals (s);
	}

}
