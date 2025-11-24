package com.javaAbir.zPractise.StringQuestion;

import java.util.Scanner;

public class Q13MinOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String--> ");
        String s = sc.next();
        String s2 ="";
        int min = 0;
        char m = ' ';
        for (int i = 0; i <s.length() ; i++) {
            s2 = s.replace(s.charAt(i)+"","");
            int count = s.length()-s2.length();
            if (min==0){
                min=count;
                m = s.charAt(i);

            } else if (count<min) {
                min=count;
                m = s.charAt(i);
            }
            s=s2;
        }
        System.out.println(m+"="+min);

    }

}
