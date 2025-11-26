package com.javaAbir.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10,5};
        System.out.println(Arrays.toString(a));
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            int index = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]>a[index]){
                    index = j;
                }
            }
            if (i!=index){
                int temp = a[index];
                a[index] = a[i];
                a[i]=temp;
            }

        }
    }

}
