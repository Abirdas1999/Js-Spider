package com.Exam;

import java.util.Scanner;

class Encode {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("enter a string ");
		String s = sc.next ();
		String s2 = "";

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 'X' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - 23);
			} else {
				arr[i] = (char) (arr[i] + 3);
			}

			s2 += arr[i];
		}

		System.out.println(s2);
	}
}