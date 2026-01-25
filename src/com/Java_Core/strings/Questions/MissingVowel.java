package com.Java_Core.strings.Questions;

class MissingVowel {
	public static void main(String[] args) {
		String s = "jspider";
		getMissing(s);
		getMissingMethod(s);
	}

	//without method
	static void getMissing(String s){
		char [] vowel = {'a','e','i','o','u'};
		char [] ch = s.toCharArray ();
		String s2 = "";
		for (char c : vowel){
			boolean flag = false;
			for (char x:ch){
				if (c==x) flag = true;
			}
			if (!flag)s2+=c;
		}
		System.out.println (s2);
	}

	//with method
	static void getMissingMethod(String s){
		char [] vowel = {'a','e','i','o','u'};
		String s2 = "";
		for (char c : vowel){
			if (!s.contains (c+""))s2+=c;
		}
		System.out.println (s2);
	}

}
