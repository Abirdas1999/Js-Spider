package com.Java_Core.pattern;

import java.util.Scanner;

public class PyramidReverseHollow {
    public static void main(String[] args) {
        System.out.println("Enter a number-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (j==2*i-1||j==1||i==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        //another approach
//        int st = 2*n-1;
//        int sp = 0;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=sp ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <=st ; j++) {
//                if (j==1||j==st||i==1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//            sp++;
//            st-=2;
//        }
    }
}
