package com.Java_Core.zPractise;
interface  I{
	void m1();
	default  void m2(){
		System.out.println ("Hii");
	}
	static void m3(){
		System.out.println ("0000");
	}
}
public class Demo implements I {
	@Override
	public void m1 () {
		System.out.println ("yuuyui");
	}

	@Override
	public void m2 () {
//		I.super.m2 ();
		System.out.println ("huih");
	}

	public static void main(String[] args) {
	    Demo d = new Demo ();
		d.m1 ();
		d.m2 ();
		I.m3 ();
	}

}
