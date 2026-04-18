package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class SceMaximum {
	public static void main(String[] args) {
		String s = "baannana";
//		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().skip (1).max (Map.Entry.comparingByValue ()).stream ().forEach (i-> System.out.println (i.getKey ()+" -> "+i.getValue ()+" "));
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().sorted (Map.Entry.<String,Long>comparingByValue ().reversed ()).skip (1).findFirst ().ifPresent (i-> System.out.println (i.getKey ()+" -> "+i.getValue ()+" "));

	}


}
