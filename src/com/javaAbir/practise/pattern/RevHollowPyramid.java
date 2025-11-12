package com.javaAbir.practise.pattern;

import java.util.Scanner;

public class RevHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number--> ");
        int n = sc.nextInt();

        int st = 2*n-1;
        int sp = 0;

        //process 1
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=i-1 ; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <=(2*n)-(2*i-1) ; j++) {
//                if (j==1||i==1||j==(2*n)-(2*i-1)) {
//                    System.out.print("*  ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }

        //process 2

        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <=st ; j++) {
                if (i==1||j==1||j==st){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            st-=2;
            sp++;
            System.out.println();
        }
    }
}
