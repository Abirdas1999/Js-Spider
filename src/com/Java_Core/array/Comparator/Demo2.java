package com.Java_Core.array.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Emp[] e = {
                new Emp("Amit", 3000),
                new Emp("Abir", 1900),
                new Emp("Atif", 2000),
                new Emp("Gaurav", 1000),
                new Emp("ShikhaJi", 2500),
                new Emp("Sikha", 2200),
        };
//        Arrays.sort(e, new EmpCompare());//default sorting


        //custom sorting
//        Sorting.sort(e, new EmpCompare());//✅creating own sort method of arrays class
//        Sorting.sort(e, new EmpName());//✅creating own sort method of arrays class
//        Sorting.sort(e, new EmpNameValue());//✅creating own sort method of arrays class
        Sorting.sort(e, new EmpNameValueTotal());//✅creating own sort method of arrays class



        System.out.println(Arrays.toString(e));

    }
}

class Emp {
    String name;
    int sal;

    public Emp(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "{" + name + "---> Sal = " + sal + " }";
    }
}

class Sorting {
    static void sort(Emp[] e, Comparator c) {
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = 0; j < e.length - 1; j++) {
                if (c.compare(e[j], e[j + 1]) > 0) {
                    Emp temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }
    }
}

class EmpCompare implements Comparator<Emp> {
    @Override
    public int compare(Emp e, Emp e2) {
        if (e.sal < e2.sal) return 1;
        if (e.sal > e2.sal) return -1;
        return 0;
    }
}

class EmpName implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        if (o2.name.length() > o1.name.length()) return -1;
        if (o1.name.length() > o2.name.length()) return 1;
        return 0;
    }
}

class EmpNameValue implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {

        if (o2.name.charAt(0) > o1.name.charAt(0)) return -1;
        if (o1.name.charAt(0) > o2.name.charAt(0)) return 1;
        return 0;
    }
}
class EmpNameValueTotal implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        if (getValue(o1) > getValue(o2)) return -1;
        if (getValue(o1) < getValue(o2)) return 1;
        return 0;
    }
    static int getValue(Emp o1){
        char [] c = o1.name.toCharArray();
        int val = 0;
        for (int i = 0; i <c.length-1 ; i++) {
            val+=c[i];
        }
        return val;
    }
}
