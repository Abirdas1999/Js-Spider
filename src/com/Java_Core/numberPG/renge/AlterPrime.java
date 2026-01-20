package com.Java_Core.numberPG.renge;

import java.util.Scanner;

public class AlterPrime {
    static void primeRenge(int st,int ed){
        int count=0;
        for (int i = st; i <=ed ; i++) {
            if (isPrime(i)){
                if (count%2==0){
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
