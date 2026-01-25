package com.Java_Core.strings.Questions;

import java.util.LinkedHashMap;
import java.util.Map;

class MinOccur {
	public static void main(String[] args) {
		String s = "malayalam";
		getMinOccur(s);
	}
	static void getMinOccur(String s){
		Map<Character,Integer> m = new LinkedHashMap<> ();
		int minCount = s.length ();
		char minChar = ' ';
		for (int i = 0; i < s.length (); i++) {
			char ch = s.charAt (i);
			if (!m.containsKey (ch)){
				m.put (ch,1);
			}else {
				m.put (ch,m.get (ch)+1);
			}
			if (m.get (ch)<minCount){
				minChar = ch;
				minCount = m.get (ch);
			}
		}
		System.out.println ("maxChar is "+minChar+"="+minCount );

	}

}
