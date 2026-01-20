package com.Java_Core.zPractise.RecursionPart2;

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number ---> ");
        int s = sc.nextInt();
        int rev = 0;
        int temp = s;
        System.out.println(isPrimePalindrome(s,rev,temp));
//        System.out.println(isPrime(s,s/2));
    }
    static boolean isPrimePalindrome(int n,int rev,int temp){
        if (n==0) {
            if (rev==temp){
                return isPrime(temp,temp/2);
            }else return false;
        };
        rev = (rev*10)+(n%10);

        return isPrimePalindrome( n/10, rev, temp);
    }
    static boolean isPrime(int n,int i){
        if (i==1) return true;
        if (n<2 || n%i==0){
            return false;
        }

        return isPrime(n,i-1);
    }

}
