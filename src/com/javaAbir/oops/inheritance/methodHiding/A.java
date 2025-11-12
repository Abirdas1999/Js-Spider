package com.javaAbir.oops.inheritance.methodHiding;

 class A {
    public static void m1(){
        System.out.println("m1()--A");
    }
}
 class B extends A{
    public static void m1(){
        System.out.println("m1()--B");//method hiding--in static method only
    }
}
class Demo{
     public static void main(String[] args) {
         B.m1();
         System.out.println("=====");
         B b = new B();
         b.m1();
         System.out.println("------");
         A a = new A();
         a.m1();
     }
}
