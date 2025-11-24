package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q12MaxOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        String s2 ="";
        char m = ' ';
        int maxCount = 0;
        while (s.length()>0){
            char c = s.charAt(0);
            s2 = s.replace(c+"","");
            int count = s.length() - s2.length();
            if(count>maxCount){
                maxCount=count;
                m = c;
            }
            s=s2;
        }
            System.out.println(m+"="+maxCount);
    }
}
