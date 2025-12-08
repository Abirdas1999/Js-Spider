package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ---> ");
        int s = sc.nextInt();
        int prod = 1;
        System.out.println(getfact(s,prod));
    }
    static int getfact(int s,int prod){
        if (s==0) return prod;
        prod*=s;
        return getfact(s-1,prod);
    }


}
