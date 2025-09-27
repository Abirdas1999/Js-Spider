package com.javaAbir.oops.methodoverriding.finalKeyword;
class A__1{
    public void m1(){
        System.out.println("M1()--A");
    }
}

class B__1 extends  A__1{
    @Override
    final public void m1(){
        System.out.println("M1()--B");
    }
}

//class C__1 extends B__1{ //final method cant be overrriden
//    @Override
//    public void m1(){
//        System.out.println("M1()--C");
//    }
//}
public class FinalMethod {
    public static void main(String[]args){
        B__1 b = new B__1();
        b.m1();
    }
}
