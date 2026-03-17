package com.Java_Core.ZZpractise;
interface A {
	void m1();
}

interface B extends A {}

interface C extends A {}

public class Dimond implements B, C {
	public void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		Dimond d = new Dimond();
		d.m1();
	}
}