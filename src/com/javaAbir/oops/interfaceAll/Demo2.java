package com.javaAbir.oops.interfaceAll;
interface I3{
    void m1();
}
interface I4{
    void m1();
}
//interface I5{
//    int m1();
//}
//class D implements I3,I5{
//    @Override
//    public void m1(){
//        System.out.println("M1()--D");
//    }
//    public int m1(){
//        return 10
//    }
//}
class D implements I3,I4{
    @Override
    public void m1(){
        System.out.println("M1()--D");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        I3 i3 = new D();
        i3.m1();
        I4 i4 = new D();
        i4.m1();
    }
}
