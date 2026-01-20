package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q6SumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        char [] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i <=c.length-1 ; i++) {
            if (c[i]>='0'&&c[i]<='9'){
                sum +=(c[i]-48);
            }
        }
        System.out.println(sum);
    }

}
