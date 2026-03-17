package com.Java_Core.strings.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccur {
	public static void main (String[] args) {
		String s = "asmalayalamdsa";//palindromic substring
//		String biggest = "";
//		System.out.println (maxOccur(s));   `
		maxOccur (s);
	}

	static void maxOccur (String s) {
		int maxCount = 0;
		char maxChar = ' ';
		Map<Character ,Integer> m = new LinkedHashMap<> ();
		for (int i = 0; i <s.length () ; i++) {
			char ch = s.charAt (i);
			if (!m.containsKey (ch))m.put (ch,1);
			else {
				m.put (ch,m.get (ch)+1);
			}

			if (m.get (ch)>maxCount){
				maxCount = m.get (ch);
				maxChar = ch;
			}
		}
		System.out.println ("maxChar is "+maxChar+"="+maxCount );


	}

}
