package com.Java_Core.numberPG;

import java.util.Scanner;

public class Strong {

//    public static int fact(int n){
//        int f=1;
//        for (int i = 1; i<=n;i++){
//            f = f*i;
//        }
//        return f;
//    }
//
//    public static int isStrongno(int n) {
//        int sum = 0;
//        while (n > 0) {
//            int d = n % 10;
//            sum = sum + fact(d);
//            n /= 10;
//        }
//        return sum;
//    }
//
//    public static void main (String[]args){
//        System.out.println("Enter a number --> ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();//number
//        if (n == isStrongno(n)) {
//            System.out.println("Number is Strong no");
//        } else {
//            System.out.println("Number is not Stromg no");
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check---> ");
        int n = sc.nextInt();
        if (isStrong(n)){
            System.out.println("Number is a Strong Number");
        }else{
            System.out.println("Number is not a Strong Number");
        }

    }
    public static Boolean isStrong(int n){
        int sum = 0;
        int temp = n;

        Boolean flag = true;
        while (n>0){
            int prod = 1;
            for (int d = n%10; d >0 ; d--) {
                prod*=d;
            }
            sum+=prod;
            n/=10;
        }

        if (sum!=temp) return flag=false;
        return flag;
    }


}
