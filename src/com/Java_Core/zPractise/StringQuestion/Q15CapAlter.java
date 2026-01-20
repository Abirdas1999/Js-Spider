package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q15CapAlter {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a String(Word)");
        String s = sc.next();
        char [] c = s.toCharArray();
        String s2 = "";

        for (int i = 0; i <c.length ; i++) {
            if (c[i]>='A'&& c[i]<='Z'){
                s2+=(char)(c[i]+32);
            } else if (c[i]>='a'&& c[i]<='z') {
                s2+=(char)(c[i]-32);
            }else {
                s2+=c[i];
            }
        }
        System.out.println(s2);
    }

}
