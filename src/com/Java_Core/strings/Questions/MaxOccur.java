package com.Java_Core.strings.Questions;

import java.util.LinkedHashMap;
import java.util.Map;

class MaxOccur {
	public static void main(String[] args) {
	    String s = "malayalam";
		getMaxOccur(s);
	}
	static void getMaxOccur(String s){
		int maxCount = 0;
		char maxChar = ' ';
		Map<Character,Integer> m = new LinkedHashMap<> ();
		for (int i = 0; i <s.length () ; i++) {
			char ch = s.charAt (i);
			if (!m.containsKey (ch)){
				m.put (ch,1);
			}else {
				m.put (ch,m.get (ch)+1);
			}
			if (m.get (ch)>maxCount){
				maxChar = ch;
				maxCount = m.get (ch);
			}
		}
		System.out.println ("maxChar is "+maxChar+"="+maxCount );
	}
	
	
}
