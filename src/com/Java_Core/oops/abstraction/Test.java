package com.Java_Core.oops.abstraction;
abstract class A{
    abstract public void m1();
    public void m2(){
        System.out.println("M2()--A");
    }
}
class B extends A{
    @Override
    public void m1(){
        System.out.println("M1()--B");
    }
    public void m3(){
        System.out.println("M3()--B");
    }
}
//
public class Test {
    public static void main(String[] args){
        //A a = new A();//abstract class can not have object
        A a = new B();
        a.m1();
        a.m2();
    }
}
