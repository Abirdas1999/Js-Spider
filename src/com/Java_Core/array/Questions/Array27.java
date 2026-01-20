package com.Java_Core.array.Questions;

import java.util.ArrayList;

class Array27 {
    public static void main(String[] args) {
        int[] a = {2,3,5,6,2,8,5};
         removeDuplicate(a);
    }
    static void removeDuplicate(int [] a){
        int index = 0;
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            while (!arr.contains(a[i])){
                arr.add(a[i]);
            }
        }

        System.out.println(arr.toString());

    }
}
