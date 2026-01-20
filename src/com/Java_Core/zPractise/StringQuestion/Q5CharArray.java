package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q5CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        char [] a = new char[s.length()];
        for (int i = 0; i <=s.length()-1 ; i++) {
            a[i]+= s.charAt(i);
            System.out.println(a[i]);
        }
    }

}
