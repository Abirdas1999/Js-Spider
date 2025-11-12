package com.javaAbir.practise.pattern;

import java.util.Scanner;

class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number--> ");
        int n = sc.nextInt();

        //process 1
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("   ");
//            }
//            //star
//            for (int j = 1; j <=2*i-1 ; j++) {
//                if (j==1||j==2*i-1||i==n) {
//                    System.out.print("*  ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
        //process 2
        int st = 1;
        int sp = n-1;
        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <=st ; j++) {
                if (j==1||i==n||j==st) {
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
