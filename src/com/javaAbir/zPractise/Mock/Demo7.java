package com.javaAbir.zPractise.Mock;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String(Word)");
        String s = sc.next();
        String s2 = "";
        char [] c = s.toCharArray();

        for (int i = c.length-1; i >=0 ; i--) {
            s2+=c[i];
        }
        System.out.println(s2);
    }

}
