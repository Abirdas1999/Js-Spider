package com.Java_Core.oops.interfaceAll;
interface I{
    void m1();

}
interface I2 extends I {
    void m2();

}
abstract class BB implements I2{
    @Override
    public void m1() {
        System.out.println("m1()--B");
    }
}
class CC extends BB{
    @Override
    public void m2() {
        System.out.println("m2()--C");
    }
}

public class Demo {
    public static void main(String[] args){
        I i = new CC();
        i.m1();
        //i.m2();
        System.out.println("-----");
        I2 i2 = new CC();
        i2.m2();
        i2.m1();
    }
}
