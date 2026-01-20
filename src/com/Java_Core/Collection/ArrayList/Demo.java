package com.Java_Core.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(20);
        l.add(40);
        l.add(10);
        l.add(20);
        l.add(23);
        System.out.println(l);
        for (Object o:l) System.out.print(o+" ");
    }

}
