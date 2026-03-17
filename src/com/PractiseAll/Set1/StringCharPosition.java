package com.PractiseAll.Set1;

import java.util.LinkedHashMap;
import java.util.Map;

class StringCharPosition {
	public static void main(String[] args) {
		String s = "bannana";
		getPosition(s);
	}
	static void getPosition(String s){
		Map<Character,String> m = new LinkedHashMap<> ();
		for (int i = 0; i <s.length () ; i++) {
			char key = s.charAt (i);
			if (m.containsKey (key)){
				String prev = m.get (key)+",";
				m.put (key,prev+i);
			}else {
				m.put (key,i+"");
			}
		}
		System.out.println (m);
	}

}
