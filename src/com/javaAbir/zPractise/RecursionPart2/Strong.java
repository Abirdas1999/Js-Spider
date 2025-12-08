package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ---> ");
        int s = sc.nextInt();
        int temp = s;
        int sum = 0;
        System.out.println(isStrong(s,sum,temp));
    }
    static boolean isStrong(int n,int sum,int temp){
        int prod = 1;
        if (n==0) return sum==temp;
        sum+=getfact(n%10,prod);
        return isStrong(n/10,sum,temp);
    }

    static int getfact(int s,int prod){
        if (s==0) return prod;
        prod*=s;
        return getfact(s-1,prod);
    }

}
