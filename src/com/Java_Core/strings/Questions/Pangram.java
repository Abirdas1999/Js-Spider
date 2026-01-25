package com.Java_Core.strings.Questions;

import java.util.LinkedHashSet;
import java.util.Set;

class Pangram {
	public static void main(String[] args) {
		String s = "The quick brown fo jumps over the lazy dog";
		System.out.println (isPanagram(s));
	}
	static boolean isPanagram(String s){
		s = s.toLowerCase ();
		char [] ch = s.toCharArray ();
		Set<Character> set = new LinkedHashSet<> ();
		for (char x: ch){
			if (x >= 'a' && x <= 'z'){
				set.add (x);
			}
		}
		return set.size ()==26;
	}

}
