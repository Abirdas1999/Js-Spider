package com.javaAbir.recursion.number;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        System.out.println(isSpy(n,sum,prod));
    }

     static boolean isSpy(int n, int sum,int prod) {
        if (n<1) return sum == prod;
        sum+=n%10;
        prod*=n%10;
        return isSpy(n/10,sum,prod);
    }

}
