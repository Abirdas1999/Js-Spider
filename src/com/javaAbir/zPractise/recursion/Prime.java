package com.javaAbir.zPractise.recursion;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number --> ");
        int n = sc.nextInt();
        if (isPrime(n,n/2)){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }
    }

    public static boolean isPrime(int n,int i){
        if (i<=1) return true;
        if (n<=1||n%i==0) return false;
        return isPrime(n,i-1);

    }

}
