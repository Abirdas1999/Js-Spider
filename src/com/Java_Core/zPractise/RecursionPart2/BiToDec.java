package com.Java_Core.zPractise.RecursionPart2;

import java.util.Scanner;

public class BiToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number ---> ");
        int s = sc.nextInt();
        int prod = 1;
        int sum =0;

        System.out.println(getDeci(s,sum,prod));
    }

    static int getDeci(int n,int sum,int prod){
        if (n==0) return sum;
        sum += prod*(n%10);
        return getDeci(n/10,sum,prod*2);

    }

}
