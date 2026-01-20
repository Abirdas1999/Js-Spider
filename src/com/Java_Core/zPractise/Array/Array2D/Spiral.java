package com.Java_Core.zPractise.Array.Array2D;

import java.util.Scanner;

class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to get pascal");
        int n = sc.nextInt();
        getSpiral(n);
    }

    static void getSpiral(int n) {
        int[][] a = new int[n][n];
        char dir = 'r';
        int r = 0;
        int c = -1;
        for (int i = 1; i <= n * n; i++) {
            switch (dir) {
                case 'r':
                    a[r][++c] = i;
                    if (c == n - r - 1) dir = 'd';
                    break;
                case 'd':
                    a[++r][c] = i;
                    if (c == r) dir = 'l';
                    break;
                case 'l':
                    a[r][--c] = i;
                    if (c == n - r - 1) dir = 'u';
                    break;
                case 'u':
                    a[--r][c] = i;
                    if (r == c + 1) dir = 'r';
                    break;

            }

        }
        for (int[] arr : a) {
            for (int arr2 : arr) System.out.print(arr2 +"\t");
            System.out.println();
        }
    }

}
