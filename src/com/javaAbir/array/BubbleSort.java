package com.javaAbir.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a = {10,2,5,0,6,23,43,9,8};
        System.out.println(Arrays.toString(a));
        Sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void Sort (int [] a ){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

}
