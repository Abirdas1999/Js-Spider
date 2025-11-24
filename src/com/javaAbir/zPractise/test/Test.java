package com.javaAbir.zPractise.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a starting number --> ");
        int st = sc.nextInt();
        System.out.println("Enter a Ending number --> ");
        int ed = sc.nextInt();
        getPrint(st,ed);
    }
    public static void getPrint(int st,int ed){
        for (int i = st; i <=ed ; i++) {
            if (i%3==0 && !(i%3==i%5)){
                System.out.println("Fizz");
            } else if (i%5==0&&!(i%3==i%5)) {
                System.out.println("buzz");
            } else if (i%3==0&&i%5==0) {
                System.out.println("Fizz-Buzz");
            }else {
                System.out.println(i+" ");
            }

        }
    }

}
