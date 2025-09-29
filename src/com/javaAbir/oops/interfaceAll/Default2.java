package com.javaAbir.oops.interfaceAll;
interface AA{
    public static void m1(){
        System.out.println("M1()--AA");
    }
}
class DD implements AA{

}
public class Default2 {
    public static void main(String[] args) {
        AA aa = new DD();
        //aa.m1();
        AA.m1();
    }
}
