package com.PractiseAll.Stream3;

import java.util.Arrays;
import java.util.stream.Collectors;

class Occourence {
	public static void main(String[] args) {
	    String s = "bannana";//a-3
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().forEach (i-> System.out.println (i.getKey ()+" -> "+i.getValue ()));
	}

}
