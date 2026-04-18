package com.PractiseAll.Stream3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class MaxOccour {
	public static void main(String[] args) {
		String s = "bannanaa";//a-4
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ()))
				.entrySet ().stream ().sorted (Map.Entry.<String ,Long>comparingByValue ().reversed ()).skip (1).findFirst ().ifPresent (System.out::println);
	}
}
