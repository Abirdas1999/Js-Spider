package com.Java_Core.zPractise.RecursionPart2;

import java.util.Scanner;

public class DecToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ---> ");
        int s = sc.nextInt();
        getBi(s);
    }
    static void getBi(int n){
        if (n<1) return;
        int d = n%2;
        getBi(n/2);
        System.out.print(d);
    }

}
