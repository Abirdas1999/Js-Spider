package com.Java_Core.pattern;

import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        System.out.println("Enter a number-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 1; i <=n ; i++) {
//            //printing the space
//            for (int j = i; j <=n ; j++) {
//                System.out.print("   ");
//            }
//            //printing the *
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*  ");
//            }
//
//            System.out.println();
//        }
        //another approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
