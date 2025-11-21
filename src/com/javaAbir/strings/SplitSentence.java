package com.javaAbir.strings;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        System.out.println("Enter a String--> ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[]a = s1.split(" ");
        for (String str:a){
            System.out.println(str);
        }
    }

}
