package com.javaAbir.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp=n;
        System.out.println(isPalindrom(n,rev,temp));
    }

     static boolean isPalindrom(int n, int rev, int temp) {
        if (n<1) return rev==temp;
        rev = (rev*10)+n%10;
        return isPalindrom(n/10,rev,temp);
    }
}
