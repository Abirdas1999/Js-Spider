package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array39 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 7, 8, 9};
        a = commonEle(a, b);
        System.out.println("New ==> " + Arrays.toString(a));
    }

    static int[] commonEle(int[] a, int[] b) {
        int len = 0;
        int index = 0;
        //getting new array len
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if (a[i] == b[j]) {
                    len++;
                    break;
                }
            }
        }
        int[] arr = new int[len];
        //putting value
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if (a[i] == b[j]) {
                    arr[index++] = a[i];
                    break;
                }
            }
        }
        return arr;
    }
}
