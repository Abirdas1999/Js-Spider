package com.Java_Core.objectMethods.toString;
class Circle{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Value -> "+radius;
    }
}
public class CircleDriver {
    public static void main(String[] args) {
        Circle c = new Circle(22);
        System.out.println(c);//if not override--> om.javaAbir.objectMethods.toString.Circle@8efb846
    }

}
