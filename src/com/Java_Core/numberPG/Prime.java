package com.Java_Core.numberPG;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        boolean flag = true;
        if (n<2){
            flag = false;
        }else {
            for (int i = 2; i <=n/2 ; i++) {
                if (n%i==0){
                    flag=false;
                    break;
                }

            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();

        if (isPrime(n)){
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }

}
