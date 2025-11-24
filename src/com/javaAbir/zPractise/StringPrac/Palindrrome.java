package com.javaAbir.zPractise.StringPrac;

import java.util.Scanner;

public class Palindrrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        char [] c = s.toCharArray();

        while (i<j){
            if (c[i]!=c[j]) return false;
            i++;
            j--;

        }
            return true;
    }

}
