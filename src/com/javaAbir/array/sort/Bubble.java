package com.javaAbir.array.sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] a = {1,23,45,12,0,7};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void Sort(int [] a){
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
