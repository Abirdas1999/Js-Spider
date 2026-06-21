package com.Exam.String;

public class RemoveDuplicate {
	public static void main (String[] args) {
		String s = "bannana";
		String s2 = "";
		char[] a = s.toCharArray ();
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]){
					flag = false;
					break;
				}
			}
			if (flag==true) {
				s2+=a[i];
			}
		}
		System.out.println (s2);
	}

}


