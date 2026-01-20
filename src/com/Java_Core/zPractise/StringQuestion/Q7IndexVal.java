package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q7IndexVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        System.out.println("Enter a char to search--> ");
        boolean flag = false;
        char p = sc.next().charAt(0);
        for (int i = 0; i <s.length() ; i++) {
            if (p == s.charAt(i)){
                System.out.println(i);
                flag = true;

            }
        }
        if (!flag){
            System.out.println("Not found");
        }


    }

}
