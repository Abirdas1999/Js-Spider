package com.Java_Core.ZZpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Occurence {
	public static void main(String[] args) {
	    String s = "bannana";
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy ((e)->e,Collectors.counting ())).entrySet ().stream ().forEach (e-> System.out.println (e.getKey ()+" --> "+e.getValue ()));
	}

}
