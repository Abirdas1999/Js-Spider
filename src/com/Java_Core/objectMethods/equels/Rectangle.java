package com.Java_Core.objectMethods.equels;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle) )return false;
        Rectangle r = (Rectangle) o;
        return r.breadth==breadth && r.length==length;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,34);
        Rectangle r2 = new Rectangle(12,34);
        System.out.println(r==r2);
        System.out.println(r.equals(r2));
    }

}
