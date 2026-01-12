package com.javaAbir.array.Questions;

import java.util.Arrays;
import java.util.Scanner;

class Array44 {
    public static void main(String[] args) {
        int [] a = {2,5,1,7,4,3,9,0};
        System.out.println("Enter a index number --> ");
        int n = new Scanner(System.in).nextInt();
        a = removeEle(a,n);
        System.out.println(Arrays.toString(a));
    }
    static int [] removeEle(int [] a,int index ){
        if (index < 0 || index>=a.length) throw new RuntimeException("Index is invalid");
        int [] arr = new int[(a.length)-index];
        int j =0;
        for (int i = 0; i <a.length-1 ; i++) {
            if (i>=index){
                arr[j++] = a[i];
            }
        }

        return arr;
    }

}
