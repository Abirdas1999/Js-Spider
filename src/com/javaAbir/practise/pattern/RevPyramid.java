package com.javaAbir.practise.pattern;

import java.util.Scanner;

public class RevPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the star-->");
        int n = sc.nextInt();

        //process 1
//        int sp=0;
//        int st=2*n-1;
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=sp ; j++) {
//                System.out.print("   ");
//            }
//            //star
//            for (int j = 1; j <=st ; j++) {
//                System.out.print("*  ");
//            }
//            sp++;
//            st-=2;
//            System.out.println();
//        }
        //process 2
        for (int i = 1; i <=n ; i++) {
            //space
            for (int j =1 ; j <=i-1 ; j++) {
                System.out.print("   ");
            }
            //str
            for (int j = 1; j <=(2*n)-(2*i-1) ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
