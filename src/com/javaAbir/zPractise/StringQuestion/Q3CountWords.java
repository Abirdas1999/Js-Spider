package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q3CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String(Sentence)--> ");
        String s = sc.nextLine();
        String [] c = s.split(" ");
        int count =0;
        String s2 = "";
        for (int i = 0; i <c.length ; i++) {
            count++;

        }
        System.out.println(count);
    }

}
