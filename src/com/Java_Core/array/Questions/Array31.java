package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array31 {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 5};
        int[] b = {3, 7, 6, 8, 9};
        a = margeArray(a,b);
        System.out.println(Arrays.toString(a));
    }

    static int [] margeArray(int [] a,int [] b){
        int count = 0;
        int [] arr = new int [a.length + b.length];
        for (int i = 0; i <a.length ; i++) {
            arr[count++] = a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            arr[count++] = b[i];
        }

        return arr;
    }

}
