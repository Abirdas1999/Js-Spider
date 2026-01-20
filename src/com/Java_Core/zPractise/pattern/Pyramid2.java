package com.Java_Core.zPractise.pattern;

public class Pyramid2 {
    public static void main(String[] args) {
        int n =5;
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("   ");
//            }
//            //star
//            for (int j = 1; j <=(2*i-1) ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//
//        }
        int st = 1;
        int sp = n-1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=st ; j++) {
                if (i==n||j==1||j==st) {
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            st+=2;
            sp--;
            System.out.println();
        }
    }
}
