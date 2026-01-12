package com.javaAbir.array.Questions;

import java.util.Arrays;

class Array56 {
    public static void main(String[] args) {
        String [] a = {"Abir","Abir","Cel","Varun","David","Gds","Bunny"};
        getSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void getSort(String [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j].compareTo(a[j+1])>0){
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }


        }
    }
}