package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q14RepeatCharNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        String s2 ="";
        char [] c = s.toCharArray();

        for (int i = 0; i <c.length ; i++) {
            int count = 0;
            char ch = c[i];
            for (int j = 0; j <c.length ; j++) {
                if (s.charAt(j)==ch) count++;
            }
            if (count>1){
                int r = 0;
                for (int k = 0; k <=i ; k++) {
                    if (c[k] ==ch) r++;
                }
                s2+=r;
            }else if (count<=1){
                s2+=ch;

            }
        }
        System.out.println(s2);
    }

}
