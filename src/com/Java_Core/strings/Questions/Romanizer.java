package com.Java_Core.strings.Questions;

import java.util.LinkedHashMap;
import java.util.Map;

class Romanizer {
	public static void main (String[] args) {
		int num = 2038;
		getConvert (num);
	}

	static void getConvert (int num) {
		Map<Integer, String> m = new LinkedHashMap<> ();
		m.put (1, "I");
		m.put (4, "IV");
		m.put (5, "V");
		m.put (9, "IX");
		m.put (10, "X");
		m.put (40, "XL");
		m.put (50, "L");
		m.put (90, "XC");
		m.put (100, "C");
		m.put (400, "CD");
		m.put (500, "D");
		m.put (900, "CM");
		m.put (1000, "M");
		String res = "";
		int[] temp = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for (int x : temp) {
			while (num >= x) {
				res += m.get (x);
				num -= x;
			}
		}
		System.out.println (res);


	}


}
