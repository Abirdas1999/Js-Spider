package com.javaAbir.numberPG;

import java.util.Scanner;

public class Spy {
    public static boolean isSpy(int n){
        boolean flag = true;
        int sum = 0;
        int prod = 1;
        while (n > 0){
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        if (sum != prod){
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();

        if (isSpy(n)){
            System.out.println("Number is Spy");
        } else {
            System.out.println("Number is not Spy");
        }
    }
}
