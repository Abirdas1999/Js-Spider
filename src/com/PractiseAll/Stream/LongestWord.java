package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class LongestWord {
	public static void main(String[] args) {
		String s = "I love programming";
		String res = Arrays.stream (s.split (" ")).max (Comparator.comparingInt (String::length)).get ();
		System.out.println (res);
	}


}
