package com.Java_Core.objectMethods.toString;

public class Car {
    String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    public static void main(String[] args) {
        Car c = new Car("Skoda");
       System.out.println(c);//fully qualify class

    }

}
