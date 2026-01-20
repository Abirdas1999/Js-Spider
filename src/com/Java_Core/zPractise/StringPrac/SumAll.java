package com.Java_Core.zPractise.StringPrac;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word ---> ");
        String s = sc.next();

        getNum(s);
    }
    public static void getNum(String s){
        int sum = 0;
        int num = 0;
        char [] c = s.toCharArray();

        for (char a : c){
            if (a>='0' && a<='9'){
                num = num*10 + (a-'0');
            }else {
                sum += num;
                num = 0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
