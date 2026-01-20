package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Binary Number --> ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        if (isPalindrome(n,temp,sum)){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
    public static boolean isPalindrome(int n,int temp,int sum){
        if (n<=0)return sum==temp;
        sum=(sum*10)+n%10;
        return isPalindrome(n/10,temp,sum);
    }

}
