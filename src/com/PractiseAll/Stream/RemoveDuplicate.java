package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "bannnnana";
		String res = Arrays.stream (s.split ("")).collect(Collectors.groupingBy (i->i,Collectors.counting ()))
						.entrySet ().stream ().filter (i->i.getValue ()==1)
						.map (Map.Entry::getKey).collect (Collectors.joining ());
		System.out.println (res);
	}
}
