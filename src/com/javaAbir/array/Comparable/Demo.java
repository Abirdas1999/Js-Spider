package com.javaAbir.array.Comparable;

import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        Circle[] c = {
                new Circle(30),
                new Circle(40),
                new Circle(60),
                new Circle(20),
                new Circle(10),
                new Circle(30),
        };
//        Arrays.sort(c);
        Sorting s = new Sorting();//✅creating own sort method of arrays class
        s.sort(c);
        System.out.println(Arrays.toString(c));
    }
}

class Sorting {

    void sort(Circle[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                //Comparable c = (Comparable) a[j];
                if (a[j].compareTo(a[j + 1]) > 0) {
                    Circle temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}


class Circle implements Comparable<Circle> {
    int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public int compareTo(Circle c) {
        return radius - c.radius;
    }

    @Override
    public String toString() {
        return "Radius =[" + radius + "]";
    }


    //how work ...
    public static void main(String[] args) {
        Circle c = new Circle(23);
        System.out.println(c.compareTo(new Circle(78)));
    }


}

