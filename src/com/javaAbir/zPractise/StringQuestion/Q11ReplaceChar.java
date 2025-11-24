package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q11ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        char c [] = s.toCharArray();
        String s2 = "";
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='a' ||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                s2+="@";
            }else {
                s2+=c[i];
            }
        }
        System.out.println(s2);
    }

}
