package com.Java_Core.oops.abstraction;
abstract class AA{
    abstract public void m1();
    public void m2(){
        System.out.println("M2()--AA");
    }
}
abstract class BB extends AA{

}
class CC extends BB{
    @Override
    public void m1(){
        System.out.println("M1()--CC");
    }
    public void m3(){
        System.out.println("M3()--CC");
    }
}
//
public class Test2 {
    public static void main(String[] args){
        //A a = new A();//abstract class can not have object
        AA a = new CC();
        a.m1();
        a.m2();
//        a.m();
    }
}
