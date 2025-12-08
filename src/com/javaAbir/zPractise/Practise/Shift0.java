package com.javaAbir.zPractise.Practise;

import java.util.Arrays;

public class Shift0 {
    public static void main(String[] args) {
        int [] a ={0,6,0,8,0,7,0,0};
        int i =0;
        int j = a.length-1;

//        2-point algorithm...
//        while (i<j){
//            if (a[i]==0 && a[j]!=0){
//                int temp = a[i];
//                a[i]=a[j];
//                a[j]=temp;
//                i++;
//                j--;
//            }
//            if (a[i]!=0 ) i++;
//            if (a[j]==0) j--;
//        }


        while (i<j){
            while (a[i]!=0) i++;
            while (a[j]==0)j--;
            if (i<j){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }


}
