package com.javaAbir.array.Questions;

import java.util.Arrays;

class Array38 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 7, 8, 9};
        a = DistrictEle(a, b);//{4,5,7,8,9}
        System.out.println("New ==> " + Arrays.toString(a));
    }

    static int[] DistrictEle(int[] a, int[] b) {
        int len = 0;
        int index = 0;


        //getting new array len from a
        for (int i = 0; i <a.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <b.length ; j++) {
                if (a[i] == b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                len++;
            }
        }

        //getting new array len from b
        for (int i = 0; i <b.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <a.length ; j++) {
                if (b[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                len++;
            }
        }



        int[] arr = new int[len];
        //putting value from a
        for (int i = 0; i <a.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <b.length ; j++) {
                if (a[i] == b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[index++] = a[i];
            }
        }

        //putting value from b
        for (int i = 0; i <b.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <a.length ; j++) {
                if (b[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[index++] = b[i];
            }
        }
        return arr;
    }
}
