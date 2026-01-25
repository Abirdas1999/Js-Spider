package com.Java_Core.strings.Questions;

class BiggestSubString {
	public static void main(String[] args) {
		String s = "asmalayalamdsa";
		String biggest = "";
		System.out.println (getBiggestSub(s,biggest));
	}
	static String getBiggestSub(String s,String biggest){
		char [] s1 = s.toCharArray ();
		for (int i = 0; i <s1.length ; i++) {
			String temp = "";
			temp+=s1[i];
			for (int j = i+1; j <s1.length ; j++) {
				temp+=s1[j];
				if (isPalindrome (temp) && biggest.length ()<temp.length ()){
					biggest = temp;
				}
			}
		}
		return biggest;
	}
	static boolean isPalindrome(String s){
		String temp ="";
		for (int i = s.length ()-1; i >=0 ; i--) {
			temp+=s.charAt (i);
		}
		return temp.equals (s);
	}
}
