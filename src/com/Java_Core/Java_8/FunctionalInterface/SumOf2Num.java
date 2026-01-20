package com.Java_Core.Java_8.FunctionalInterface;


import java.util.function.BiPredicate;


class SumOf2Num {
	public static void main (String[] args) {
		BiPredicate<Integer, Integer> p = (n, m) -> (n + m) % 2 == 0;
		System.out.println (p.test (3, 3));



	}

}
