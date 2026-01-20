package com.Java_Core.zPractise.recursion;

import java.util.Scanner;

public class DecToBi {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number --> ");
        int n = sc.nextInt();
        getBinary(n);
    }
    public static void getBinary(int n){
        if (n<1) return;
        int d = n%2;
        getBinary(n/2);
        System.out.print(d+" ");
    }

}
