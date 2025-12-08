package com.javaAbir.array.normal;

public class Smallest {
    public static void main(String[] args) {
        int [] a = {2,4,1,7,8,9};
        int small = a[0];
        //linear search
        for (int i = 0; i <=a.length-1 ; i++) {
            if (a[i]<small) small = a[i];
        }
        System.out.println(small);
    }

}
