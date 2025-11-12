package com.javaAbir.recursion.number;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        System.out.println(isStrong(n,sum,temp));
    }

     static boolean isStrong(int n,int sum,int temp) {
        int mul = 1;
        if(n<1) return sum == temp;
        sum+=getFact(n%10,mul);
        return isStrong(n/10,sum,temp);
    }

     static int getFact(int n, int mul) {
        if (n<=1) return mul;
        mul*=n;
        return getFact(n-1,mul);
    }

}
