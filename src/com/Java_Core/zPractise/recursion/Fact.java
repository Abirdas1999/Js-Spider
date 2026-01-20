package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number --> ");
        int n = sc.nextInt();
        int prod =1;
        System.out.println(getFact(n,prod));
    }
    public static int getFact(int n ,int prod){
        if (n<=0) return prod;
        prod*=n;
        return getFact(n-1,prod);
    }
}
