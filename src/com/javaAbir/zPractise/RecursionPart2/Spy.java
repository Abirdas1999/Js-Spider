package com.javaAbir.zPractise.RecursionPart2;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number ---> ");
//        int s = sc.nextInt();
        int st =1;
        int ed = 100;
//        int prod = 1;
//        int sum = 0;
//        System.out.println(isSpy(s,prod,sum));
        getRengeSpy(st,ed);
    }
    static void getRengeSpy(int st,int ed){
        if (st>ed) return;
        int prod = 1;
        int sum = 0;
        if (isSpy(st,prod,sum)){
            System.out.print(st+ " ");
        }
        getRengeSpy(st+1,ed);

    }
    static boolean isSpy(int n ,int p,int s){
        if (n<1) return s==p;
        s+=n%10;
        p*=n%10;
        return isSpy(n/10,p,s);
    }


}
