package com.Java_Core.zPractise.pattern;

public class Number1 {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            //number
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"  ");
            }
            //number other side
            for (int j =i ; j >1; j--) {
                System.out.print(j+"  ");
                
            }
            System.out.println();

        }
    }
}
