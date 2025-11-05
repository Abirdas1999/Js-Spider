package com.javaAbir.recursion;

import java.util.Scanner;

public class Emrif {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEmrif(n));
    }

    static boolean isEmrif(int n) {
        int rev =0;
        if (n==getReverse(n,rev)) return false;
        return isPrime(n,n/2) && isPrime(getReverse(n,rev),getReverse(n,rev)/2);
    }
    static boolean isPrime(int n,int i){
        if (i==1) return true;
        if (n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }
    static int getReverse(int n,int rev){
        if (n<1) return rev;
        return getReverse((n/10),(rev*10)+n%10);
    }
}
