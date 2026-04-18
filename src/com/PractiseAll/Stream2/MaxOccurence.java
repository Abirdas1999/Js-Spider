package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class MaxOccurence {
	public static void main(String[] args) {
		String s = "baannana";
		String ss = Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ())).entrySet ().stream().max (Map.Entry.comparingByValue ()).map (i->i.getKey ()+" -> "+i.getValue ()).get ();
		System.out.println (ss);
	}


}
