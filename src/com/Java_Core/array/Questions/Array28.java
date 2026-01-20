package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array28 {
    public static void main(String[] args) {
        int[] a = {231, 554, 572, 962, 24, 1};
        a = revArr(a);
        System.out.println(Arrays.toString(a));
    }
    static int [] revArr(int [] a){
        int [] arr = new int[a.length];

        for (int i = 0; i <a.length ; i++) {
            arr[i] = getRev(a[i]);
        }
        return arr;
    }
    private static int  getRev(int n){
        int temp = 0;
        while (n>0){
            temp = temp*10+n%10;
            n/=10;
        }
        return temp;
    }
}
