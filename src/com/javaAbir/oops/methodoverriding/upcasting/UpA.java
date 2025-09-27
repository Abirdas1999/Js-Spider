package com.javaAbir.oops.methodoverriding.upcasting;
class A {
    public void m1(){
        System.out.println("M1()--A");
    }
}

class B extends A {
    public void m2(){
        System.out.println("M2()--B");
    }
}

class C extends B {
    public void m3(){
        System.out.println("M3()--C");
    }
}
public class UpA {
    public static void main(String[]args){
        A a = new B(); //upcasting
        a.m1();
//        a.m2(); specific method of b and c
//        a.m3();

        B b = new C();
        b.m1();
        b.m2();
//        b.m3(); specific method of C

        A a1 = new C();
        a1.m1();


    }
}
