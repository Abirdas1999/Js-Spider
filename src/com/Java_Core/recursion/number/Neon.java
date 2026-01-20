package com.Java_Core.recursion.number;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int sq = n*n;
        System.out.println(isNeon(n,sum,sq));
    }

     static boolean isNeon(int n, int sum, int sq) {
        if (sq<1) return sum==n;
        sum+=sq%10;
        return isNeon(n,sum,sq/10);
    }
}
