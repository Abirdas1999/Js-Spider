package com.Java_Core.oops.interfaceAll;
interface  I1{
    int i =20;//➡️static final int i
    void m1();//➡️public abstract void m1()
}
class B implements I1{
    @Override
    public void m1(){
        System.out.println("M1()--B");
    }
}
public class Test {
    public static void main(String[] args){
        I1 i = new B();
        i.m1();
        //I1.i=200;//❌can not re-declare because final can't be changed
        System.out.println(I1.i);//✅can access because it is a static variable
    }
}
