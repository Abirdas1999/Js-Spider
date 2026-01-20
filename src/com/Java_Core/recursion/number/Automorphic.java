package com.Java_Core.recursion.number;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        System.out.println(isAutomorphic(n,sq));
    }

     static boolean isAutomorphic(int n, int sq) {
        if (n!=0) return n%10==sq%10;
        return isAutomorphic(n/10,sq/10);
    }
}
