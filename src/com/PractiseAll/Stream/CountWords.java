package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Comparator;

class CountWords {
	public static void main(String[] args) {
		String s = "I love programming";
		Long res = Arrays.stream (s.split (" ")).count ();
		System.out.println (res);
	}
}
