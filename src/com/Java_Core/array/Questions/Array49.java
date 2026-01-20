package com.Java_Core.array.Questions;

import java.util.Arrays;

class Array49 {
    public static void main(String[] args) {
        int [] a = {2,5,1,7,4,3,9,0};
        getSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void getSort(int [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            //using selection sort...
            int index = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[index]){
                    index = j;
                }
            }
            if (i!=index){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
    }

}
