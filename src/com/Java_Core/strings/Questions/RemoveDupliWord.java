package com.Java_Core.strings.Questions;

import java.util.*;

class RemoveDupliWord {
	public static void main(String[] args) {
	    String s = "java is very very easy language is java ";
		getDistinct (s);
	}
	static void getDistinct(String s){
		String s2 = "";
		String [] ch = s.split (" ");
		Set<String> l = new LinkedHashSet<> ();
		for (String a:ch){
			l.add (a);
		}
		for (String x:l){
			s2+=x+" ";
		}
		System.out.println (s2);
	}

}
