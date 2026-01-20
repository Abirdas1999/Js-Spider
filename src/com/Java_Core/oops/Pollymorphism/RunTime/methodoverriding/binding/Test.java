package com.Java_Core.oops.Pollymorphism.RunTime.methodoverriding.binding;
class A {
    static int i = 10;
    int j = 20;
    public static void m1(){
        System.out.println("M1()--A");
    }
    public void m2(){
        System.out.println("M2()--A");
    }
    final void m3(){
        System.out.println("M3()--A");
    }
}
class B extends A {
    static int i = 40;
    int j = 50;

    public static void m1(){
        System.out.println("M1()--B");
    }
    @Override
    public void m2(){
        System.out.println("M2()--B");
    }
//    final void m3(){
//        System.out.println("M3()--B"); //final method can not be override
//    }
}

public class Test {
    public static void main(String[] args){
        A a = new B();
        a.m1();//early binding
        a.m2();//late binding
        a.m3();//early binding

        System.out.println(a.j);//late binding
        System.out.println(a.i);//early binding
}

}
