package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ---> ");
        int s = sc.nextInt();
        int temp = s;
        int sum = 0;
        int len = (s+"").length();
        System.out.println(isArmstrong(s,sum,temp,len));

    }
    static boolean isArmstrong(int n,int sum,int temp,int len){
        if (n==0) return temp == sum;
        sum+=(int)Math.pow(n%10,len);
        return isArmstrong(n/10,sum,temp,len);
    }

}
