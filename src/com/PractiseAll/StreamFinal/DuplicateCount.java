package com.PractiseAll.StreamFinal;

import java.util.Arrays;
import java.util.stream.Collectors;

class DuplicateCount {
	public static void main(String[] args) {
		String s = "banana";
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().filter (i->i.getValue ()>1).forEach (System.out::println);
	}

}
