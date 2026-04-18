package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class FirstRepetingChar {
	public static void main(String[] args) {
		String s = "bannana";
		String res = Arrays.stream (s.split (""))
				.collect(Collectors.groupingBy (i->i, LinkedHashMap::new,Collectors.counting ()))
				.entrySet ().stream ().filter (i->i.getValue ()>1)
				.map (Map.Entry::getKey).findFirst ().get ();
		System.out.println (res);
	}

}
