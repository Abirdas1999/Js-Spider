package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q2Arrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String(Word)--> ");
        String s = sc.next();
        char [] c = s.toCharArray();
        String s2 ="";
        String up="";//for the upper case
        String lo="";//for the lower case
        String n="";//for the number
        String sp="";//for the special character
        for (int i = 0; i <c.length ; i++) {
            if (c[i]>= '0' && c[i]<='9'){
                n+=c[i];
            } else if (c[i]>= 'a' && c[i]<='z') {
                lo+=c[i];
            } else if (c[i]>= 'A' && c[i]<='Z'){
                up+=c[i];
            }else {
                sp+=c[i];
            }
        }
        s2+=n+sp+lo+up;
        System.out.println(s2);
    }

    public static class Q5CharArray {

    }
}
