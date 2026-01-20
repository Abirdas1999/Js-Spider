package com.Java_Core.array.sort;

import java.util.Arrays;

class Selcetion {
    public static void main(String[] args) {
        int [] a = {8,1,4,12,0,7};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void Sort(int [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            int index = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[index]){
                    index=j;
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
