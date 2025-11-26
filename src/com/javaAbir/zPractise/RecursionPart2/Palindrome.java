package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ---> ");
        int s = sc.nextInt();

        int rev = 0;
        int temp = s;

        System.out.println(ispalindrome(s,rev,temp));
    }
    static boolean ispalindrome(int n,int rev,int temp){
        if(n==0) return rev==temp;
        rev = rev*10+(n%10);
        return ispalindrome(n/10,rev,temp);
    }

}
