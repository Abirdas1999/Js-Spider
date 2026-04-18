package com.PractiseAll.Stream2;

import java.util.Arrays;
import java.util.stream.Collectors;

class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "baannana";
		Arrays.stream (s.split ("")).collect(Collectors.toSet ()).forEach (System.out::print);
	}


}
