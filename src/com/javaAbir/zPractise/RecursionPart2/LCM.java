package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for LCM");
        int n = sc.nextInt();
        System.out.println("Enter a number for LCM");
        int m = sc.nextInt();
        int a = n>m? n:m;
        int b = a;
        System.out.println(getLCM(n,m,a,b));
    }
    static int getLCM(int n, int m, int a, int b) {
        if (b > n * m) return n * m;
        if (b % n == 0 && b % m == 0)return b;
        return getLCM(n, m, a, b + a);
    }
}
