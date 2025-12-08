package com.javaAbir.array.sort;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={5,8,1,2,9,12,4};
        System.out.println(Arrays.toString(a));
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int st,int end){
        if(st>=end) return;
        int i=st;int j=end;
        int pivot=a[(st+end)/2];

        while(i<=j){
            while(a[i]<pivot) i++;
            while(a[j]> pivot) j--;

            if(i<=j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        sort(a,st,j);
        sort(a,i,end);
    }

}
