package com.Java_Core.Java_8.FunctionalInterface;

import java.util.function.*;

class EvenOdd {
	public static void main(String[] args) {
		Predicate <Integer> p = n->n%2==0;
		System.out.println (p.test (5));
	}

}
