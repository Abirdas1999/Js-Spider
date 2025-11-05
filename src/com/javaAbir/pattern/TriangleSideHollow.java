package com.javaAbir.pattern;

import java.util.Scanner;
//not completed
public class TriangleSideHollow {
    public static void main(String[] args) {
        System.out.println("Enter a number-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            //printing the space
            for (int j = i; j <=n ; j++) {
                System.out.print("   ");
            }
            //printing the *
            for (int j = 1; j <=i ; j++) {
                if (i==n||j==i){
                    System.out.print("*  ");
                }
                System.out.print("   ");
            }

            System.out.println();
        }
    }
}
