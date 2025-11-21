package com.javaAbir.zPractise.recursion;

import java.util.Scanner;

public class EvenRenge {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the starting number to search --> ");
        int st = sc.nextInt();
        System.out.println("Enter the ending number to search --> ");
        int ed = sc.nextInt();
        getEven(st,ed);
    }
    public static void getEven(int st,int ed){
        if (st>ed) return;
        if (st%2==0){
            System.out.println(st);
        }
        getEven(st+1,ed);
    }

}
