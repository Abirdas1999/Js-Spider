package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array36 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = addIndex(a);
        System.out.println("New ==> " + Arrays.toString(a));
    }
    static int [] addIndex(int [] a){
        int [] arr = new int[a.length+1];
        int index = 0;
        for (int i = 0; i <a.length ; i++) {
            if (index == 3) arr[index++] = 5;
            arr[index++] = a[i];
        }
        return arr;
    }
}
