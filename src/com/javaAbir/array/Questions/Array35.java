package com.javaAbir.array.Questions;

import java.util.Arrays;

class Array35 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 4, 5, 1};
        a = DuplicateIndex(a);
        System.out.println("New ==> " + Arrays.toString(a));
    }
    static int [] DuplicateIndex(int [] a){
        int index = 0;
        int len = 0;

        //check count
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <a.length-1-i ; j++) {
                if (a[i]==a[j]){
                    len++;
                }
            }
        }

        int [] arr = new int[len];
        //add value
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <a.length-1-i ; j++) {
                if (a[i]==a[j]){
                    arr[index++] = a[i];
                }
            }
        }
        return arr;
    }
}
