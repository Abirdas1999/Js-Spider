package com.PractiseAll.StreamFinal;

import java.util.Arrays;

class RemoveDuplicate {
	public static void main(String[] args) {
	    String s = "banana";
		Arrays.stream (s.split ("")).distinct ().forEach (System.out::print);
	}


}
