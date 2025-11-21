package com.javaAbir.zPractise.string;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence--> ");
        String s = sc.nextLine();
        char [] c = s.toCharArray();
        String s2="";
        int count =0;
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                s2+='_';
                count++;
            } else {
                s2+=c[i];
            }
        }
        System.out.println(s2 +"  --> "+count);
    }

}
