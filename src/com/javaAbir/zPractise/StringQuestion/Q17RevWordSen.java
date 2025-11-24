package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q17RevWordSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String(Sentence)--> ");
        String s = sc.nextLine();
        char [] c = s.toCharArray();
        String s2 = "";
        int start =0;
        for (int i = 0; i <=c.length ; i++) {
            if (i==c.length||c[i]==' '){

                for (int j = i-1; j >=start ; j--) {
                    s2+=c[j];
                }
                if (i < c.length) s2 += " ";
                start = i + 1;
            }

        }
        System.out.println(s2);
    }

}
