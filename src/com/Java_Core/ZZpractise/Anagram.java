package com.Java_Core.ZZpractise;

class Anagram {
	public static void main(String[] args) {
		System.out.println (getAnagram("listen","silentd"));
	}
	static boolean getAnagram(String s,String s2){
		if (s.length ()==0 || s2.length ()==0)return s.length ()==s2.length ();
		char d = s.charAt (0);
		s = s.replace (d+"","");
		s2 = s2.replace (d+"","");
		return getAnagram (s,s2);

	}

}
