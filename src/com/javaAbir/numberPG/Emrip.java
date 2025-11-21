package com.javaAbir.numberPG;

import java.util.Scanner;

public class Emrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check --> ");
        int n = sc.nextInt();
        if (isEmrip(n)){
            System.out.println("Number is a Emrip");

        }else {
            System.out.println("Number is not Emrip");
        }



    }
    static boolean isEmrip(int n){
        int rev = 0;
        if (isPrime(n)){
            while (n>0){
                rev =  ((rev*10)+n%10);
                n/=10;
            }
            if (!(isPrime(rev))){
                return false;
            }
            return true;
        }
        return false;
    }
    static boolean isPrime(int n){
        boolean flag = true;
        if (n <= 1) {
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

}
