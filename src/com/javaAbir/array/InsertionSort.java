package com.javaAbir.array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
            int [] a = {2,4,6,8,2,4,4,-10,0,5};
            System.out.println(Arrays.toString(a));
            InserSort(a);
            System.out.println(Arrays.toString(a));
    }
    static void InserSort(int [] a){
        for (int i = 1; i <a.length ; i++) {
            int key = a[i];
            int j = i-1;
            while (j>=0&&a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

        }

    }

}
