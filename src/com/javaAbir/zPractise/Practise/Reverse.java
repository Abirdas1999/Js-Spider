package com.javaAbir.zPractise.Practise;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] a ={3,6,10,8,0,7,4,3};
         int i =0;
         int j = a.length-1;

        while (i<j){   //2-point algorithm...
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }

}
