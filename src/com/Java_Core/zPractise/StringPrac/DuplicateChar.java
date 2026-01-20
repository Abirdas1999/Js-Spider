package com.Java_Core.zPractise.StringPrac;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        getDuplicateChar(s);
    }

    public static void getDuplicateChar(String s){
        String s2 = "";
        while (s.length()>0){
            char a = s.charAt(0);
            int count = 0;
            s2+=s.toLowerCase().replace(a+"","");
            count = s.length()-s2.length();

            System.out.println(a+" --> "+count);
            s=s2;
            s2="";

        }
    }

}
