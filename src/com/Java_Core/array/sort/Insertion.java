package com.Java_Core.array.sort;

import java.util.Arrays;

class Insertion {
    public static void main(String[] args) {
        int [] a = {8,1,6,0,3,2,7,4};
        Sort(a);
        System.out.println(Arrays.toString(a));
        for (int b : a){
            System.out.print(b+" ");
        }
    }
    static void Sort(int [] a){
        for (int i = 1; i <a.length ; i++) {
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

}
