package com.javaAbir.array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        int[] a = {3,4,5,7,9,0,9,7,7,1};
        System.out.println(Arrays.toString(a));
        MergeSort(a);
        System.out.println(Arrays.toString(a));


    }
    static void MergeSort(int [] a){
        if (a.length == 1)return;
        int[] left = new int [a.length/2];
        int [] right = new int [a.length - left.length];

        int i = 0;
        while (i<left.length){
            left[i] = a[i];
            i++;
        }
        int j = 0;
        while (j<right.length){
            right[j] = a[i];
            i++;
            j++;
        }
        MergeSort(right);
        MergeSort(left);
        getMerge(left,right,a);

    }
    static void getMerge(int a[],int b[],int [] c){
        int i = 0, j = 0, k = 0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k++]=a[i++];
            }else {
                c[k++]=b[j++];
            }
        }
        while (i<a.length){
            c[k++] = a[i++];
        }
        while (j<b.length){
            c[k++] = b[j++];
        }
    }
}
