package com.Java_Core.recursion.number;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number--> ");
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }

    static int Fib(int n) {
        if (n == 1 || n == 0) return n;
        int a = Fib(n-1);
        int b = Fib(n-2);
        return (a+b);

    }
}
