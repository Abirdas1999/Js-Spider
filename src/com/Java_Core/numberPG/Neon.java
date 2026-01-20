package com.Java_Core.numberPG;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check---> ");
        int n = sc.nextInt();
        if (isNeon(n)){
            System.out.println("Number is a Neon Number");
        }else{
            System.out.println("Number is not a Neon Number");
        }
    }
    public static Boolean isNeon(int n){
        int sum = 0;
        int sq = n*n;
        while (sq>0){
            sum+=sq%10;
            sq/=10;
        }
        if (n==sum){
            return true;
        }else {
            return false;
        }
    }

}
