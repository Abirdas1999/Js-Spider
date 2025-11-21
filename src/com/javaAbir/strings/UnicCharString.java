package com.javaAbir.strings;

import java.util.Scanner;

public class UnicCharString {
    public static void main(String[] args) {
        System.out.println("Enter a String--> ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String s2 = "";
        char[] a = s1.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            if (s2.indexOf(a[i])==-1){
                s2+=a[i];
            }
        }
        System.out.println(s2);

    }


}
