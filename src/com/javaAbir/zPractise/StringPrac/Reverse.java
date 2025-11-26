package com.javaAbir.zPractise.StringPrac;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        char [] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;

        while (i<j){
            char temp = c[i];
            c[i]=c[j];
            c[j] = temp;
            i++;
            j--;
        }
        String s2 = new String(c);
        System.out.println(s2);
    }

}
