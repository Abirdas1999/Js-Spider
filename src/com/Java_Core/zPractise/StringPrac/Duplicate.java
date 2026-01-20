package com.Java_Core.zPractise.StringPrac;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        getDuplicate(s);
    }


    public static void getDuplicate(String s){
        String s2 = "";
        while (s.length()>0){
            char a = s.charAt(0);
            s2+=s.toLowerCase().replace(a+"","");
            if (s.length()-s2.length()>1){
                System.out.println(a);
            }
            s=s2;
            s2="";

        }
    }
}
