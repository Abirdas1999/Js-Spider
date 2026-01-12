package com.javaAbir.array.Questions;

import java.util.Arrays;

class Array37 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = deleteIndex(a);
        System.out.println("New ==> " + Arrays.toString(a));
    }
    static int [] deleteIndex(int [] a){
        int [] arr = new int[a.length-1];
        int index = 0;
        for (int i = 0; i <a.length ; i++) {
            if (i!=2){
                arr[index++] = a[i];
            }

        }
        return arr;
    }
}
