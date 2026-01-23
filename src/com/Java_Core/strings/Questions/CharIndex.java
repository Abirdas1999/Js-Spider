package com.Java_Core.strings.Questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class CharIndex {
	public static void main (String[] args) {
		String s = "banana";
		getIndexVal (s);
	}

	static void getIndexVal (String s) {
		Map<Character, List<Integer>> m = new LinkedHashMap<> ();
		for (int i = 0; i < s.length (); i++) {
			// if key not present, create new list
			if (!m.containsKey (s.charAt(i))) {
				m.put (s.charAt(i), new ArrayList<> ());
			}

			// add index to the list
			m.get (s.charAt(i)).add (i);
		}

		m.forEach ((key, value) -> System.out.println (key + "=" + value));
	}

}
