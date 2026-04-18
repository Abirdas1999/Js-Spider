package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.stream.Collectors;

class DuplicateChar {
	public static void main(String[] args) {
		String s = "baannana";
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().filter (i->i.getValue ()>1).forEach (i-> System.out.println (i.getKey ()+" -> "+i.getValue ()));
	}


}
