package com.javaAbir.oops.interfaceAll.functional;

import java.util.Scanner;

@FunctionalInterface
interface Payable{
    void pay();
    //void payment();
}
class Upi implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment done by UPI");
    }
}
class Cash implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment done by Cash");
    }
}
class Card implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment done by Card");
    }
}
public class Payment {
    public static Payable getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your payment mode-->\n1:Upi\n2:Cash\n3:Card");
        int n = sc.nextInt();
        if (n==1){
            return new Upi();
        } else if (n==2) {
            return new Cash();
        } else if (n==3) {
            return new Card();
        }else {
            System.out.println("Invalid");
            return null;
        }
    }

    public static void main(String[] args) {
        Payable p = getInfo();
        p.pay();
    }
}