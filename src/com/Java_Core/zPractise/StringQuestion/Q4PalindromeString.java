package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q4PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        String s2 ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            s2+=s.charAt(i);
        }
        System.out.println(s2);
        if (s2.equals(s)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("not");
        }
    }

}
