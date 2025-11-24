package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q9VowelPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        char [] c = s.toCharArray();
        String s2 = "";

        int count = 0;
        for (int i = 0; i <c.length; i++) {
            if (c[i]=='a' ||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                if (s2.indexOf(c[i])== -1){
                    s2+=c[i];
                }

            }
        }
        System.out.println(s2);
    }

}
