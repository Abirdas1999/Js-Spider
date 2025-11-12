package com.javaAbir.recursion.number;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int div = 1;
        System.out.println(isPerfect(n,sum,div));
    }

     static boolean isPerfect(int n, int sum, int div) {
        if (div>n/2) return sum==n;
        if (n%div==0) sum+=div;
        return isPerfect(n,sum,div+1);
    }
}
