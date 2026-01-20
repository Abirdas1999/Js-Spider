package com.Java_Core.array.search;

public class Linear {
    public static void main(String[] args) {
        int [] a = {2,43,12,5,32,90,23,90};
        System.out.println(Search(a,32));
    }
    static int Search(int [] a, int target){
        for (int i = 0; i <=a.length-1 ; i++) {
            if (a[i]==target) return i;

        }
        return -1;
    }

}
