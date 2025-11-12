package com.javaAbir.recursion.number;

import java.util.Scanner;

public class SumTillSingle {
    public static void main(String[] args) {
        System.out.println("Enter a number to get the Sum-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }

    static int getSum(int n) {
        int sum;
        if(n<=9) return n;
        sum = getSum(n/10) + getSum(n%10);
        if(sum>9) return getSum(sum);
        return sum;
    }
}
