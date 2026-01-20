package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class Emrif {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number --> ");
        int n = sc.nextInt();
        int rev = 0;

        if (isEmrif(n,rev)){
            System.out.println("Number is Emrif");
        }else {
            System.out.println("Number is not Emrif");
        }
    }
    public static boolean isPrime(int n,int i){
        if (i==1) return true;
        if (n<=1 || n%i==0) return false;
        return isPrime(n,i-1);

    }
    public static boolean isEmrif(int n,int rev){
        if (n<=0) return isPrime(rev,rev/2);
        rev = rev*10+n%10;
        return isEmrif(n/10,rev);


    }

}
