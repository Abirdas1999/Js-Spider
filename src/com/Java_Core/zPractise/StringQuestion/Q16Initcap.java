package com.Java_Core.zPractise.StringQuestion;

import java.util.Scanner;

public class Q16Initcap {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String(Sentence)--> ");
        String s = sc.nextLine();
        char [] c = s.toCharArray();
        String s2 = "";

            for (int j = 0; j <c.length ; j++) {
                if (j==0 && c[j]!=' '|| (c[j] != ' ' && c[j - 1] == ' ')){
                    if (c[j]>='A'&&c[j]<='Z'){
                        s2+=c[j];
                    }else {
                        s2+=(char)(c[j]-32);
                    }
                }else {
                    s2+=c[j];
                }
            }
        System.out.println(s2);
    }

}
