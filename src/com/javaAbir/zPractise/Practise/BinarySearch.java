package com.javaAbir.zPractise.Practise;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {1,2,3,12,42,0,9,32,43,55,17};
        System.out.println(Search(a,0));

    }
    static int Search(int [] a , int key){
        int st = 0,ed = a.length-1;
        while (st<=ed){
            int mid  = (st+ed)/2;

            if (key==a[mid]) return mid;
            else if (key<a[mid]) ed = mid -1;
            else st = mid+1;
        }
        return -1;
    }

}
