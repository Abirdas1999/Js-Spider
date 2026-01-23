package com.Java_Core.Java_8.Programing;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
interface EvenOdd{
	Boolean isEvenOdd (int x);
}
class Even {
	public static void main(String[] args) {
		System.out.println ("Enter a Number --> ");
		int x = new Scanner (System.in).nextInt();
		EvenOdd e = (n)->{
			Predicate<Integer> p = i->i%2==0;
			return p.test (n);
		};
		System.out.println (e.isEvenOdd (x));
	}


}
