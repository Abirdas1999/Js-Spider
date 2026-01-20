package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array33 {
    public static void main(String[] args) {
        int[] a = {2, 4, 0, 1, 5, 0, 6, 0, 8, 0};
        SiftZeros(a);
        System.out.println(Arrays.toString(a));
    }
    static void SiftZeros(int [] a){
        int index = 0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i] == 0){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                index++;
            }

        }
    }

}
