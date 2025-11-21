package com.javaAbir.strings;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
//        System.out.println("Enter a String--> ");
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
        String s1 = "pool";
        String s2 ="";
        for (int i = 0; i <=s1.length()-1 ; i++) {
            if (s1.charAt(i)=='o'){
                s2+="@";
            }else {
                s2+=s1.charAt(i);
            }
        }
        System.out.println(s2);
    }

}
