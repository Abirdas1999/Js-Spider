package com.Java_Core.oops.Pollymorphism.RunTime.methodoverriding.downcasting;

class A{
    public void m1(){
        System.out.println("M1()--A");
    }
}

class B extends A{
    @Override
    public void m1(){
        System.out.println("M1()--B");
    }
    public void m2(){
        System.out.println("M2()--B");
    }
}

class E extends B{
    @Override
    public void m1(){
        System.out.println("M1()--E");
    }
    @Override
    public void m2(){
        System.out.println("M2()--E");
    }
}

class C extends A{
    public void m3(){
        System.out.println("M3()--C");
    }
}

class D extends C{
    public void m4(){
        System.out.println("M4()--D");
    }
}

public class Demo {
    public static void main(String[] args){
//        A a = new B();
//        a.m2();
//        a.m1();
        //A a = new C(); // up-casting C to A
        //B b = (B) a;
       // b.m1();//without upcasting down-casting is not possiable
        //b.m2();
       // b.m3();//error for no IS-A relation between B and C

        A a = new E();//upcasting E to A
//        a.m1();
        B b =(B)a; //Down-casting A to B
        b.m2();//it print E class because upcasting 1stly created for E object ,there only 1object created...
        b.m1();


        System.out.println("-------");

//        A a = new D();//upcasting D to A
//        C c = (C) a;//downcasting between A to C and it will no error because C and D has IS-A relation
//        c.m1();
//        c.m3();
//
//
//        D d = (D) a;//downcasting between A to D
//        d.m4();


        //c.m2();//error
    }
}
