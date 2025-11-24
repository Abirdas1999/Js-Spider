package com.javaAbir.zPractise.StringPrac;

import java.util.Scanner;

public class SumEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        getSum(s);
    }
    public static void getSum(String s){
        int sum = 0;
        char [] c = s.toCharArray();

        for (char a : c){
            if (a>='0' && a<='9'){
                sum+=(a-'0');
            }
        }
        System.out.println(sum);
    }

}
