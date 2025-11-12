package com.javaAbir.practise.pattern;

import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the star-->");
        int n = sc.nextInt();

        //process 1.
//        for (int i = 1; i<=n ; i++) {
//
//            //print the space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("   ");
//            }
//            //print the star
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*  ");
//
//            }
//            for (int j = 1; j <=i-1 ; j++) {
//                System.out.print("*  ");
//
//            }
//            System.out.println();
//        }

        //process -2
//        for (int i = 1; i <=n ; i++) {
//            //print the space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("   ");
//            }
//            //print the star
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }

        //process 3

        int sp=n-1;
        int st=1;
        for (int i = 1; i <=n ; i++) {

            //print space
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            //print star
            for (int j = 1; j <=st ; j++) {
                System.out.print("*  ");
            }
            sp--;
            st+=2;
            System.out.println();

        }
    }
}
