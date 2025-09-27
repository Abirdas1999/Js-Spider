package com.javaAbir.oops.abstraction;
abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract public void getArea();
    abstract public void display();
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(String color,int length,int breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void getArea() {
        System.out.println(length*breadth);
    }

    @Override
    public void display() {
        System.out.println(color+" "+length+" "+breadth);
    }
}
class Circle extends Shape{
    int radius ;
    public Circle(String color,int radius){
        super(color);
        this.radius=radius;
    }

    @Override
    public void getArea() {
        double res = 3.14*radius*radius;
        System.out.println(res);
    }

    @Override
    public void display() {
        System.out.println(color+" "+radius);
    }
}

public class ShapeDriver {
    public static void main(String[] args){
        Shape s ;
        s = new Rectangle("Red",10,15);//Shape s = new Rectangle()
        s.display();
        s.getArea();
        System.out.println("------");
        s = new Circle("Blue",10);
        s.display();
        s.getArea();
    }
}
