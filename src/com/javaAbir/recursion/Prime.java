package com.javaAbir.recursion;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n,n/2));
    }

    static boolean isPrime(int n, int i) {
        if (i==1) return true;
        if (n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }
}
