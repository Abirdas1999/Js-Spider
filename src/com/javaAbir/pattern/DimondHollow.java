package com.javaAbir.pattern;

import java.util.Scanner;

public class DimondHollow {
public static void main(String[] args) {
    System.out.println("Enter a number-->");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


    // #1.Hollow dimond
    // upper portion of diamond
    int st = 1, sp = n - 1;
    for (int i = 1; i <= n; i++) {
        // spaces
        for (int j = 1; j <= sp; j++) {
            System.out.print("  ");
        }
        // stars & hollow part
        for (int j = 1; j <= st; j++) {
                System.out.print("* ");

//            if (j == 1 || j == st) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
        }
        sp--;
        st += 2;
        System.out.println();
    }

    // // lower portion of diamond
    st = 2 * n - 3;
    sp = 1;
    for (int i = 1; i <= n - 1; i++) {
        // spaces
        for (int j = 1; j <= sp; j++) {
            System.out.print("  ");
        }
        // stars & hollow part
        for (int j = 1; j <= st; j++) {
                System.out.print("* ");

//            if (j == 1 || j == st) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
        }
        sp++;
        st -= 2;
        System.out.println();
    }

}
}
