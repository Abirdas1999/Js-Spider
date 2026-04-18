package com.PractiseAll.Set1;

public class Demo {
	public static void main (String[] args) {
		String s = "Java     is Easy"; //→ output --> avaj si ysae
		String s2 = "";
		int st = 0;
		for (int i = 0; i < s.length (); i++) {
			if (s.charAt (i) == ' '  || i == s.length () - 1) {

				int end = (i == s.length () - 1) ? i : i - 1;
				for (int j = end; j >= st; j--) {
					s2 += s.charAt (j);
				}

				if (i != s.length () - 1) {
					s2 += " ";
				}
				st = i + 1;
			}


		}
		System.out.println (s2);
	}
}
