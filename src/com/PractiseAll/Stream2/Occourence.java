package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Occourence {
	public static void main(String[] args) {
	    String s = "bannana";
		 Arrays.stream (s.split ("")).collect(Collectors.groupingBy(i->i,Collectors.counting ())).forEach ((i,j)-> System.out.print ("[ "+i+" -> "+j+" ]"));
	}


}
