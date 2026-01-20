package com.Java_Core.pattern;

import java.util.Scanner;

public class RambusHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();


        //normal rambus ...
         for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= n - i; j++) {
                 System.out.print("   ");
             }

             for (int j = 1; j <= n; j++) {
                 if (j == n || i == n || i == 1 || j == 1) {

                     System.out.print("*  ");
                 } else {
                     System.out.print("   ");
                 }
             }
             System.out.println();

         }
    }
}
