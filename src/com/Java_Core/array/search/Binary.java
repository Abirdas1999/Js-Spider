package com.Java_Core.array.search;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int [] a = {2,43,12,5,32,90,23,90};
        Arrays.sort(a);
        System.out.println(BinarySearch(a,32));
        System.out.println(Arrays.toString(a));
    }
    static int BinarySearch(int [] a,int key){
        int st = 0;
        int ed = a.length-1;
        while (st<=ed){
            int md = (st+ed)/2;
            if (key==a[md]) return md;
            else if (key<a[md]) ed = md - 1;
            else st = md + 1;
        }
        return -1;
    }

}
