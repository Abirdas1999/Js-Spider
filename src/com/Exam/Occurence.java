package com.Exam;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Occurence {
	public static void main(String[] args) {
		String s  = "banana";
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ()))
				.entrySet ().stream ().forEach (i-> System.out.print (i.getKey ()+" --> "+i.getValue ()+" "));
	}

}
