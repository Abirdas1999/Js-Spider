package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array40 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};//456 123--> 123 456 ==>321 654==> 456 123
        siftEle(a);
        System.out.println("New ==> "+Arrays.toString(a));
    }
    static void siftEle(int[] a) {
        int n = a.length;
        int half = n / 2;

        reverse(a, 0, half - 1);
        reverse(a, half, n - 1);
        reverse(a, 0, n - 1);
    }

    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];//temp = a[0]
            a[start++] = a[end];//a[0] = a[2]
            a[end--] = temp;//a[2] = temp
        }
    }


}
