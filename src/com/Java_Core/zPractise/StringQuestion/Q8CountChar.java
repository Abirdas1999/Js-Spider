package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q8CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        String s2 ="";
        while (s.length()>0){
            char c = s.charAt(0);
            s2 = s.replace(c+"","");
            int count = s.length() - s2.length();
            System.out.println(c+"="+count);
            s=s2;
        }
    }

}
