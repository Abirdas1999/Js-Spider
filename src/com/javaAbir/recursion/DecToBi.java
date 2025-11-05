package com.javaAbir.recursion;

import java.util.Scanner;

public class DecToBi {
    public static void main(String[] args) {
        System.out.println("Enter a number to Check-->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toBinary(n);
    }

     static void toBinary(int n) {
        if (n<=0)return;
        int c=n%2;
        toBinary(n/2);
        System.out.print(c+" ");
    }
}
