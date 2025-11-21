package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q1ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String(Word)--> ");
        String s = sc.next();
        char [] c = s.toCharArray();
        String s2 ="";
        for (int i = c.length -1; i >=0 ; i--) {
            s2+=c[i];
        }
        System.out.println(s2);

    }

}
