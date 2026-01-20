package com.Java_Core.oops.interfaceAll;
interface J1{
    void m1();
    default void m2(){
        System.out.println("m2()--J1");
    }
}
class P implements J1{

    @Override
    public void m1() {
        System.out.println("m1()--P");
    }
}
public class Default {
    public static void main(String[] args) {
        J1 j = new P();
        j.m1();
        j.m2();
    }
}
