package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array32 {

    public static void main(String[] args) {
        int[] a = {2, 4, 0, 1, 5, 0, 6, 0, 8, 0};
        SiftZerosRight(a);
        System.out.println(Arrays.toString(a));
    }

    static void SiftZerosRight(int[] a) {

//        for (int i = 0; i <a.length ; i++) {
//
//            for (int j = 0; j <a.length ; j++) {
//                if(a[j] == 0 && a[i] != 0){
//                    int temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//            }
//
//
//        }

        int index = a.length - 1;
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] == 0) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                --index;
            }


        }
    }
}


