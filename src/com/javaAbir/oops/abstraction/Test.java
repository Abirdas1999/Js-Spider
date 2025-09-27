package com.javaAbir.oops.abstraction;
abstract class A{
    abstract public void m1(){
        System.out.println("M1()--A");
    }
    public void m2(){
        System.out.println("M2()--A");
    }
}
class B extends A{
    @Override
    public void m1(){
        System.out.println("M2()--B");
    }
}

public class Test {
    public static void main(String[] args){
        //A a = new A();//abstract class can not have object
        A a = new B();
        a.m1();
        a.m2();
    }
}
