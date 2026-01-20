package com.Java_Core.array.Questions;

class Array10 {
    public static void main(String[] args) {
        int[] a = {2,3,5,6,2,8,5,5};
        secLastNum(a);
    }
    static void secLastNum(int [] a){
        int key = 0;
        for (int i = a.length-1; i >0 ; i--) {
            ++key;
            if (key==2){
                key=a[i];
                System.out.println(key);
                return;
            }

        }
    }
}
