package com.javaAbir.oops.constructor.consturctorChain;
class A{
    int a;
    A(){
        this(23);
        System.out.println("A-()"+a);
    }
    A(int a){
        this.a = a;
        System.out.println("A-(a)");
    }

}
class B extends A{
    B(){
        System.out.println("B-->()");
    }
    B(int a){
        this();
        this.a=a;
    }
}

public class Chain {
    public static void main(String[] args) {
        B b = new B(34);
    }


}
