package com.PractiseAll.Stream;
interface A{
	default void m1(){
		System.out.println ("Abc");
	}
	static void m2(){
		System.out.println ("ABC");
	}
}
class Demo{
	public static void main(String[] args) {
	    A a = new A () {
		    @Override
		    public void m1 () {
			    A.super.m1 ();
		    }
	    };
		A.m2 ();
	}

}
