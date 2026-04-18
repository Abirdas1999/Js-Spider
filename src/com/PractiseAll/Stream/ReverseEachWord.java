package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

class ReverseEachWord {
	public static void main(String[] args) {
		String s = "I love programming";
		String res = Arrays.stream (s.split (" ")).map (i->new StringBuilder (i).reverse ().toString ()).collect (Collectors.joining (" "));
		System.out.println (res);
	}
}
