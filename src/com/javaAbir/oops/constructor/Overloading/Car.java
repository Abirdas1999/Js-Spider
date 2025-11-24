package com.javaAbir.oops.constructor.Overloading;

public class Car {
    int num;
    String name;
    String color;

    public Car(){
        System.out.println("No car available");//default constructor
    }
    public Car(int num,String name,String color){
        this.num=num;
        this.name=name;
        this.color = color;
    }
    public Car(int num){
        this.num = num;
    }
    public  void display(){
        System.out.println(num+" "+name+" "+color);
    }

    public static void main(String[] args) {
        Car c = new Car(123);
        Car c2 = new Car(123,"Benz","REd");
        Car c3 = new Car();
//        c3.display();
        c2.display();
    }

}
