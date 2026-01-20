package com.Java_Core.zPractise.Mock;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number  --->  ");
        int n = sc.nextInt();

        int st = 1;
        int sp = n-1;
        for (int i = 1; i <=2*n-1; i++) {
            //space
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <=st ; j++) {
                if (j==1||j==st){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }

            }
            if (i<n){
                sp--;
                st+=2;
            }else {
                sp++;
                st-=2;
            }
            System.out.println();


        }
    }

}
