package com.javaAbir.array.normal;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] a = {0,2,0,43,12,5,32,0,90,23,0,90};
        int i = 0;
        int j = a.length-1;
        while (i<j) {
            while (a[i]!=0) i++;
            while (a[j]==0) j--;
            if (i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
