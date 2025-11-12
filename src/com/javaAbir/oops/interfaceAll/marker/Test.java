package com.javaAbir.oops.interfaceAll.marker;
interface Washable{};
class Car implements Washable{};
class Bike implements Washable{};
class Mobile{};
class Tv{};

public class Test {
    public static void wash(Object o){
        if (o instanceof Washable){
            System.out.println(o.getClass().getSimpleName()+" is washed.");
        }else {
            System.out.println(o.getClass().getSimpleName()+" is not washed.");
        }
    }

    public static void main(String[] args) {
        wash(new Tv());
        wash(new Mobile());
        wash(new Bike());
    }
}
