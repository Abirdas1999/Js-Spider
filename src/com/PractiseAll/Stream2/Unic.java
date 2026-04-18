package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.stream.Collectors;

class Unic {
	public static void main(String[] args) {
		String s = "badannana";
		Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream ().filter (i-> i.getValue ()==1).forEach (i->System.out.print (i.getKey ()));
	}


}
