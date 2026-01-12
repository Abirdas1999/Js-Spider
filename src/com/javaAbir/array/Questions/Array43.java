package com.javaAbir.array.Questions;

import java.util.Arrays;
import java.util.Scanner;

class Array43 {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 7, 4, 3, 9, 0};
        randomEle(a);
        System.out.println(Arrays.toString(a));
    }

    static void randomEle(int[] a) {
        for (int i = a.length-1; i >0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }


}
