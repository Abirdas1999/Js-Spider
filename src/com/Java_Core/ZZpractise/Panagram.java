package com.Java_Core.ZZpractise;

class Panagram {
	public static void main (String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		char check = 97;
		System.out.println (getPanagram (s.replace (" ", "").toLowerCase (),check));
	}
	static boolean getPanagram(String s,char check){
		if ((int)check>122)return true;
		if (!s.contains (check+""))return false;
		return getPanagram (s,(char)(check+1));
	}

}


