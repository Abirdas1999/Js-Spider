package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array30 {
    public static void main(String[] args) {
        int[] a = {231, 554, 572, 962, 24, 1};
        a = sumOfDigit(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] sumOfDigit(int[] a) {
        int[] arr = new int[a.length];

        for (int i = 0; i <a.length ; i++) {
            int key = a[i];
            int sum = 0;
            if (key/10 == 0) sum+=key;

            while (key>0) {
                if ((key%10)%2 == 0){
                    sum+=(key%10);
                }
                key/=10;
            }
            arr[i] = sum;

        }
        return arr;
    }

}
