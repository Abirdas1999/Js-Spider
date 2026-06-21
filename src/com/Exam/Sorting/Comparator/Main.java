package com.Exam.Sorting.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		String[] arr = {
				"girishma","abir", "Abir", "abir", "babbly",
				"amit", "anis", "chinmaya", "akhher",
				"lover", "gaurav", "atif", "sikha",
				"spider"
		};


		Sorting.sort(arr, new MyComparator());
		Arrays.sort (arr,new MyComparator());
//		Sorting.sort(arr, new MyComparator());
//		Arrays.sort (arr);
//		System.out.println (arr[i].compareTo (arr[j]));


		for (String s : arr) {
			System.out.print(s+" ,");
		}
	}
}
class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		// Compare length first
		if (s1.length() > s2.length()) return 1;
		if (s1.length() < s2.length()) return -1;

		// If length same, compare character by character

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) > s2.charAt(i))
				return 1;

			if (s1.charAt(i) < s2.charAt(i))
				return -1;
		}

		return 0;
	}
}

class Sorting {

//	Comparator<String> comparator = MyComparator<>();
	public static void sort(String[] arr, Comparator<String> comparator) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}