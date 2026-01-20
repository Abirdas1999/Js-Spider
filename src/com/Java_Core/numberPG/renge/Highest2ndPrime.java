package com.Java_Core.numberPG.renge;

import java.util.Scanner;

public class Highest2ndPrime {
    static void primeRenge(int st,int ed){
        int count=1;
        for (int i = ed; i >=st ; i--) {
            if (isPrime(i)){
                if (count==2){
                    System.out.println(i+" ");
                }
            count++;
            }
        }
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        if (n<2){
            flag = false;
        }else {
            for (int i = 2; i <=n/2 ; i++) {
                if (n%i==0){
                    flag=false;

                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number --> ");
        int st = sc.nextInt();
        System.out.println("Enter ending number --> ");
        int ed = sc.nextInt();
        primeRenge(st,ed);
    }

}
