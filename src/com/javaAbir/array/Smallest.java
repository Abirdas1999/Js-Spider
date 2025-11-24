package com.javaAbir.array;

public class Smallest {
    public static void main(String[] args) {
        int [] a ={3,5,6,9,1,5,0,-1};
        int s = a[0];

        for (int i = 1; i <a.length ; i++) {
            if (a[i]<s){
                s = a[i];
            }

        }
        System.out.println(s);

    }

}
