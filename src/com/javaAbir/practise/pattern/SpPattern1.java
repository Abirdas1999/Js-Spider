package com.javaAbir.practise.pattern;

public class SpPattern1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j =1 ;j<=i;j++){
                System.out.print(m+"  ");

                m+=1;
            }
            System.out.println();
        }
    }
}
