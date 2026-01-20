package com.Java_Core.array.Array2D;

import java.util.Scanner;

class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the pascal triangle");
        int num = sc.nextInt();
        getPascal(num);

    }
    static void getPascal(int n){

        //getting the array
        int [] [] a = new int[n][];
        for (int i = 0; i <a.length ; i++) {
            a[i] = new int[i+1];
            for (int j = 0; j <a[i].length ; j++) {
                if (i==j||j==0) a[i][j] = 1;
                else a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        //printing the array
        for (int i=0; i<a.length;i++){
            for (int j = 0; j <=a.length-i-1 ; j++) {
                System.out.print(" ");

            }
            for (int c : a[i]) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }

}
