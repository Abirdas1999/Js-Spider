package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class SortString {
	public static void main(String[] args) {
		String s = "bannnnana";
		String res = Arrays.stream (s.split ("")).collect(Collectors.groupingBy (i->i,Collectors.counting ()))
				.entrySet ().stream ().sorted ((a,b)->b.getValue ().compareTo (a.getValue ()))
				.map (e->e.getKey ().repeat (e.getValue ().intValue ())).collect (Collectors.joining ());
		System.out.println (res);
	}
}
