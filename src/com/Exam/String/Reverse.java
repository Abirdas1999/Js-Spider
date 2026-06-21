package com.Exam.String;

class Reverse {

	public static void main(String[] args) {
	    String s = "Java is easy";//avaj si ysae
//		getString(s);
		String s2 = "";
		int start = 0;
		char [] arr = s.toCharArray ();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==' ' && arr[i-1] != ' ' || i==arr.length-1){
				int end;

				// for last character
				if (i == arr.length - 1) {
					end = i;
				} else {
					end = i - 1;
				}


				// reverse word
				for (int j = end; j >= start; j--) {
					s2 += arr[j];
				}


				// add space
				if (i != arr.length - 1) {
					s2 += " ";
				}
				start = i + 1;
			}
		}
		System.out.println (s2);
	}

	static void getString (String s) {
		char[] a = s.toCharArray ();
		String s2 = "";
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ' && a[i - 1] != ' '||i==a.length-1) {
				for (int j = i; j >=x; j--) {
					s2+=a[j];
				}
				x = i;
			}
		}
		System.out.println (s2);
	}

}
