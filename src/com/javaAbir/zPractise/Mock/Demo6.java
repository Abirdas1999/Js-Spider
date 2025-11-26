package com.javaAbir.zPractise.Mock;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how much number  --->  ");
        int count = sc.nextInt();
        getFibo(0,1,count);

    }
    static void getFibo(int a,int b,int count){
        if (count<1) return;
        if (a==0&&b==1){
            System.out.print(a+" ");
            System.out.print(b+" ");
            count-=2;
        }
        int c = a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
        count--;
        getFibo(a,b,count);
    }

}
