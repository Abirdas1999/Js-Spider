package com.javaAbir.oops.abstraction;
abstract class Q{
    Q(){
        System.out.println("Q()--Cons");
    }
}
class W extends Q{

}
class Z extends W{
    Z(){
        System.out.println("Z()--Cons");
    }
}
public class Demo {
    public static void main(String[] args){
        new Z();
    }
}
