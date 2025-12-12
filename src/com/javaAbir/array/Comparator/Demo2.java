package com.javaAbir.array.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Emp [] e = {
                new Emp("Amit",3000),
                new Emp ("Abir",1900),
                new Emp ("Atif",2000),
                new Emp ("Gourav",1000),
                new Emp ("Sikha ji",2500),
                new Emp ("Sikha",2200),
        };
        Arrays.sort(e,new Emp1());
    }
}
class Emp1 implements Comparator{
    String name;
    int sal;
    public Emp(String name,int sal){
        this.name = name;
        this.sal=sal;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp) o1;
        Emp e2 = (Emp) o2;
        if (e1.sal>e2.sal) return 1;
        if (e1.sal<e2.sal) return -1;
        return 0;
    }
}
class Sorting {
    void sort(){

    }
}