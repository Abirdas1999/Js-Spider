package com.javaAbir.zPractise.Practise;

public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {1,2,3,12,42,0,9};
        System.out.println(Search(a,9));
        System.out.println(Search(a,3));
    }
    static int Search(int [] a ,int key){
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==key) return i;

        }
        return -1;
    }

}
