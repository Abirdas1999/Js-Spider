package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array29 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1};
        int[] b = {2,3,5,6,7,8,9};
        a = margeAddArray(a, b);
        System.out.println(Arrays.toString(a));
    }

    static int[] margeAddArray(int[] a, int[] b) {
        int len = (a.length > b.length) ? a.length : b.length;

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            int x = (i < a.length) ? a[i] : 0;
            int y = (i < b.length) ? b[i] : 0;
            arr[i] = x + y;
        }
        return arr;
    }
}
