package com.javaAbir.array.normal;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] a = {2,43,12,5,32,90,23,90};
        int i = 0;
        int j = a.length-1;
        while (i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }

}
