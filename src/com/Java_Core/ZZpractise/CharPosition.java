package com.Java_Core.ZZpractise;

import java.util.LinkedHashMap;
import java.util.Map;

class CharPosition {
	public static void main(String[] args) {
	    String s = "banana";
		getPosition(s);
//		print like {b=0,a=1,3,5,n=2,4}
	}
	static void getPosition(String s){
		Map<Character,String> m = new LinkedHashMap<> ();
		for (int i = 0; i <s.length () ; i++) {
			char d = s.charAt (i);
			if (!m.containsKey (d)){
				m.put (d,i+"");
			}else {
				m.put (d,m.get (d)+","+i);
			}
		}
//		m.forEach((key,value)->{
//			if(value.contains(",")){
//				System.out.println(key + "=" + value);
//			}
//		});
		System.out.println (m);
	}

}
