package com.Java_Core.zPractise.Mock;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number  --->  ");
        int n = sc.nextInt();
        int sp = 0;
        int st = 2*n-1;

        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <=st ; j++) {
                System.out.print("*  ");
            }
            sp++;
            st-=2;
            System.out.println();


        }
    }

}
