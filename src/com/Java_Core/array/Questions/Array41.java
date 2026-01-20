package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array41 {
    public static void main(String[] args) {
        int[] a = {2, 1, 7, 4, 3, 9, 0, 11};//[6,8,10]
//        Arrays.sort(a);
        System.out.println("Old ==> "+Arrays.toString(a));
        a = missingEle(a);
        System.out.println("New ==> "+Arrays.toString(a));
    }

    static int[] missingEle(int[] a) {
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];
        int index = 0;
        int[] arr = new int[(max - min)+1 - (a.length)];
        for (int i = 1; i < a.length; i++) {
            for (int j = a[i-1]+1; j < a[i]; j++) {
                arr[index++] = j;
            }
        }
        return arr;
    }
}
