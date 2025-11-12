package com.javaAbir.recursion.number;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int len = (n+"").length();
        System.out.println(isArmstrong(n,sum,temp,len));
    }

     static boolean isArmstrong(int n, int sum,int temp,int len) {
        if (n<1) return sum==temp;
        sum+=(int)(Math.pow(n%10,len));
        return isArmstrong(n/10,sum,temp,len);
    }
}
