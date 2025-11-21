package com.javaAbir.strings;

import java.util.Scanner;

public class RevSentence {
    public static void main(String[] args) {
        System.out.println("Enter a String--> ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String [] a = s1.split(" ");
        String s2 ="";
        for (int i = a.length-1; i >=0 ; i--) {
            s2+=a[i];
            if (i>0) s2+=" ";

        }
        System.out.println(s2);
    }

}
