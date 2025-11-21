package com.javaAbir.zPractise.pattern;

public class Dimond {
    public static void main(String[] args) {
        int n = 7;
        int sp = n-1;
        int st = 1;
        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=st ; j++) {
                if (j==1||j==st){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if (i<=(2*n-1)/2){
                sp--;
                st+=2;
            }else {
                sp++;
                st-=2;
            }
        }
    }

}
