package com.javaAbir.oops.Pollymorphism.RunTime.methodoverriding.methodHiding;

class A_1{
    public static void m1(){
        System.out.println("M1()--A");
    }
}
class B_1 extends  A_1{
        //method hiding
    public static void m1(){
        System.out.println("M1()--b");
    }
}

public class Demo_2 {
    public static void main(String[] args) {
        B_1 b = new B_1();
        b.m1();
    }
}
