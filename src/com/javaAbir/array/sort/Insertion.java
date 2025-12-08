package com.javaAbir.array.sort;

import java.util.Arrays;

class Insertion {
    public static void main(String[] args) {
        int [] a = {1,1,65,0,3,2,7,45};
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
