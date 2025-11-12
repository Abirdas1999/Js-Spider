package com.javaAbir.oops.association.composite;
class Engine{
    void startEngine(){
        System.out.println("Starting the engine...");
    }
}
public class Car {
    Engine e;
    Car(){
        e = new Engine();
    }
    void startCar(){
        e.startEngine();
        System.out.println("Car is starting...");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }

}
