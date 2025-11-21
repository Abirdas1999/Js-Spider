package com.javaAbir.zPractise.pattern;

public class Question1 {
    public static void main(String[] args) {
        int  n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >=1 ; j--) {
                if (j+(i-1)<=i){
                    System.out.print(j+(i-1));
                }else {
                    System.out.print(j+(i-1)+" * ");
                }
            }
            System.out.println();
        }
    }

}
