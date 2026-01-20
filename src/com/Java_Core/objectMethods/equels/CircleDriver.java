package com.Java_Core.objectMethods.equels;
class Circle{
    int radius;
    public Circle(int radius){
        this.radius =radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) return false;
        return  radius == ((Circle)obj).radius;
    }

    @Override
    public String toString() {
        return "Radius: "+radius;
    }
}
public class CircleDriver {
    public static void main(String[] args) {
        Circle c = new Circle(23);
        Circle c2 = new Circle(23);
        Circle c3 = new Circle(24);
        Circle c4 = c;

        System.out.println(c==c2);
        System.out.println(c.equals(c2));
        System.out.println(c.equals(c3));
        System.out.println(c.equals(c4));
        System.out.println(c.toString());

    }

}
