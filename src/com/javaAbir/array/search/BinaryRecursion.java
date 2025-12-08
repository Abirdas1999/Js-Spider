package com.javaAbir.array.search;

import java.util.Arrays;

public class BinaryRecursion {
    public static void main(String[] args) {
        int [] a = {2,43,12,5,32,90,23,90};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int st = 0;
        int ed = a.length-1;
        System.out.println(BinaryRecursionSearch(a,32,st,ed));
    }
    static int BinaryRecursionSearch(int [] a,int key,int st ,int ed){
        if (st>ed)return -1;
        int md = (st+ed)/2;
        if (key==a[md]){
            return md;
        } else if (key>a[md]) {
            return BinaryRecursionSearch(a,key,(st=md+1),ed);
        } else{
            return BinaryRecursionSearch(a,key,st,(ed=md-1));
        }
    }

}
