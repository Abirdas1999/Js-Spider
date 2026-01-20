package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number --> ");
        int n = sc.nextInt();
        int sum = 0;
        if (isNeon(n,n*n,sum)){
            System.out.println("Number is Neon");
        }else {
            System.out.println("Number is not Neon");
        }
    }

    public static boolean isNeon(int n , int sq ,int sum){
        if (sq<=0) return sum==n;
        sum+=sq%10;
        return isNeon(n,sq/10,sum);
    }

}
