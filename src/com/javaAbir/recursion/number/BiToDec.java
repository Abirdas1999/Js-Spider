package com.javaAbir.recursion.number;

import java.util.Scanner;

public class BiToDec {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        System.out.println(toDec(n,sum,prod));
    }

     static int toDec(int n, int sum, int prod) {
        if(n<1) return sum;
        int c= prod*(n%10);
        sum+=c;
        return toDec(n/10,sum,prod*2);
    }
}
