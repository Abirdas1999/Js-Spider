package com.Java_Core.oops.constructor.copyConstructor;

public class Car {
    String name;
    int num;
    String color;
    public Car(String name,int num,String color){
        this.name=name;
        this.num = num;
        this.color = color;
    }
    public Car(Car c){
        this.name=c.name;
        this.num=c.num;
        this.color=c.color;
    }
    public void display(){
        System.out.println(color+" "+name+" "+num);
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW",234,"Blue");
        Car c2 = new Car(c1);
        c1.display();
        c2.display();

    }

}
