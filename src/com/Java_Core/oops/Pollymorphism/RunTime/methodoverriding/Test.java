package com.Java_Core.oops.Pollymorphism.RunTime.methodoverriding;
class A{
    public void m1(){
        System.out.println("m1()--A");
    }
}

class B extends A{
    @Override
    public void m1(){
        System.out.println("m1()--B");
    }
}
public class Test {
    static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}
