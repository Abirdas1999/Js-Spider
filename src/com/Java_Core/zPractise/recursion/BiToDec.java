package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class BiToDec {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Binary Number --> ");
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        System.out.println(getDec(n,prod,sum));
    }
    public static int getDec(int n,int prod,int sum){
        if (n==0) return sum;
        sum+=(n%10)*prod;
        return getDec(n/10,prod*2,sum);
    }
}
