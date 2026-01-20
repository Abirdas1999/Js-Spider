package com.Java_Core.zPractise.Mock;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number -->");
        int st = sc.nextInt();
        System.out.println("Enter 2nd number -->");
        int ed = sc.nextInt();
        int sum = 0;
        perfectRenge(st,ed);
    }
    static void perfectRenge(int st,int ed){
        if (st>ed)return;
        int sum = 0;
        if (isPerfect(st,sum,st/2)){
            System.out.print(st +" ");
        }
        perfectRenge(st+1,ed);
    }
    static boolean isPerfect(int n,int sum,int i){
        if (i<1) return sum==n;
        if (n%i==0) sum+=i;
        return isPerfect(n,sum,i-1);
    }

}
