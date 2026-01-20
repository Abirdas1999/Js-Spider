package com.Java_Core.zPractise.RecursionPart2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for GCD");
        int n = sc.nextInt();
        System.out.println("Enter a number for GCD");
        int m = sc.nextInt();
        int b = n<m? n:m;
        System.out.println(getGCD(n,m,b));
    }
    static int getGCD(int n,int m,int b){
        if (b==1) return 1;
        if ((n%b==0)&&(m%b==0)) return b;
       return  getGCD(n,m,b-1);

    }

}
