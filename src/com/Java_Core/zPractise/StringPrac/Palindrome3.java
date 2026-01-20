package com.Java_Core.zPractise.StringPrac;

import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        for (int i = 0; i <s.length()-1 ; i++) {
            for (int j = 0; j <s.length()-1 ; j++) {
                if (isPalindrome(s,i,j)) j++;
                System.out.print(s.substring(i,j+1)+" ");
            }

        }

        System.out.println(isPalindrome(s,1,2));

    }
    static boolean isPalindrome(String s,int st,int ed){
        char [] c = s.toCharArray();
        while (st<ed){
            if (c[st]!=c[ed]) return false;
            st++;
            ed--;
        }
        return true;

    }

}
