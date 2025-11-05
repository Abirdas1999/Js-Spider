package com.javaAbir.pattern;

import java.util.Scanner;

public class TriangleReverse {
    public static void main(String[] args) {
        System.out.println("Enter a number-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
