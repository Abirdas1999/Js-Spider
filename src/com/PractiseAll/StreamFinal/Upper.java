package com.PractiseAll.StreamFinal;

import java.util.Arrays;

class Upper {
	public static void main(String[] args) {
		String s = "banana";
		Arrays.stream (s.split ("")).map (String::toUpperCase).forEach (System.out::print);
	}

}
