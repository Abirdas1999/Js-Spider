package com.Exam.String;

class MaxNonRepeatedSubString {
	public static void main (String[] args) {
		String s = "bananna";
		String max = "";

		for (int i = 0; i < s.length (); i++) {
			String temp = "";
			for (int j = 0; j < s.length (); j++) {
				char ch = s.charAt (j);
				if (temp.indexOf (ch) != -1) {
					break;
				}
				temp += ch;

			}
			if (max.length ()<temp.length ()){
				max = temp;
			}

		}
		System.out.println (max+" --> "+max.length ());
	}

}
