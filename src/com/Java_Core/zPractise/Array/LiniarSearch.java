package com.Java_Core.zPractise.Array;

public class LiniarSearch {
    public static void main(String[] args) {
        int [] arr = {2,4,1,43,54,65,23,30};
        int target = 65;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int [] arr,int target){
//        if (arr.length<1) return -1;
        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]==target){
               return i;
           }
        }
        return -1;
    }

}
