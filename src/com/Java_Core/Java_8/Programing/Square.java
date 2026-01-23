package com.Java_Core.Java_8.Programing;

import java.util.Scanner;
import java.util.function.Function;

@FunctionalInterface
interface Inter{
	void getRes();
}

class Square {
	public static void main(String[] args) {
		System.out.println ("Enter a Number --> ");
		int n = new Scanner (System.in).nextInt();
		Inter in = ()->{
			Function <Integer,Integer> f = i-> i*i;
			System.out.println (f.apply (n));
		};
		in.getRes();
	}


}
