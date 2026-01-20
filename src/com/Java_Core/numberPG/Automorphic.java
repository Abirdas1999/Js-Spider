package com.Java_Core.numberPG;

import java.util.Scanner;

public class Automorphic {
    public static Boolean isAutomorphic(int n,int sq){
        Boolean flag = true;
        while (n>0){
            if (n%10!=sq%10){
                flag=false;
                break;
            }
            n/=10;
            sq/=10;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();//number
        int sq=n*n;


        if (isAutomorphic(n,sq)){
            System.out.println("Number is Automorphic");
        }else {
            System.out.println("Number is not Automorphic");
        }





        //with loop---->✅
//        boolean flag = true;
//        while (n>0){
//            if (n%10!=sq%10){
//                flag=false;
//                break;
//            }
//            n/=10;
//            sq/=10;
//        }
//        if (flag==true){
//            System.out.println("Number is Automorphic ");
//        }else {
//            System.out.println("Not Automorphic");
//        }
    }
}
