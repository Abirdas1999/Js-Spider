package com.PractiseAll.Stream;

import java.util.Arrays;

class Duplicate {
	public static void main(String[] args) {
		String s = "bannana";
		removeDupli(s);
	}
	static void removeDupli(String s){
		Arrays.stream (s.split ("")).distinct ().forEach (System.out::print);
	}}
