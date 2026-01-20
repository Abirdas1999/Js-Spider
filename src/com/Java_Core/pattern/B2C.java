package com.Java_Core.pattern;

public class B2C {
    public static void main(String[] args) {
        int a = 1;
        char c = 'A';
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (j==1||j==2*i-1||i==n){
                    System.out.print(c++ +"  ");

                }else {
                    System.out.print(a++ +"  ");

                }

            }

            System.out.println();

        }
    }

}
