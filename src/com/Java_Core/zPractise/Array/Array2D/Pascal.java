package com.Java_Core.zPractise.Array.Array2D;

import java.util.Scanner;

class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to get pascal");
        int n = sc.nextInt();
        getPascal(n);
    }

    static void getPascal(int n) {
        int[][] a = new int[n][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == i) a[i][j] = 1;
                else a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int[] arr : a) {
//            for (int sp : arr) System.out.print(" ");
            for (int arr2 : arr) System.out.print(arr2 + " ");
            System.out.println();
        }
    }

}
