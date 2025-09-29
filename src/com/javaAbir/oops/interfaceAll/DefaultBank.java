package com.javaAbir.oops.interfaceAll;
import java.util.Scanner;

interface Bank {
    void rateOfInt();
    default void creditCard(){
        System.out.println("No credit card");
    }
    public static void IFSC(Object o){
        System.out.println(o.getClass().getSimpleName() + " Bank-IFSC");
        currInfo();
    }

    static void currInfo() {
        System.out.println("RBI-Info");
    }
}
class SBI implements Bank{

    @Override
    public void rateOfInt() {
        System.out.println("SBI rate of INT is : 10");
    }
    @Override
    public void creditCard(){
        System.out.println("SBI-Credit card");
    }
    public void Yono(){
        System.out.println("SBI-YONO App");
    }

}
class Icici implements Bank{

    @Override
    public void rateOfInt() {
        System.out.println("ICICI rate of int is : 11");
    }

    @Override
    public void creditCard() {
        System.out.println("ICICI Credit card");
    }
    public void IMobile(){
        System.out.println("IMobile App");
    }
}
class Axis implements Bank{

    @Override
    public void rateOfInt() {
        System.out.println("Axis rate of int is: 9");
    }
}
class BankDriver1{
    public static Bank getBank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SBI \n 2.ICICI \n 3.AXIS \n 4.None");
        int n = sc.nextInt();
        if (n == 1) return new SBI();
        else if (n==2) return new Icici();
        else if (n==3) return new Axis();
        else {
            System.out.println("Invalid");
            return null;
        }
    }
}
public class DefaultBank {
    public static void main(String[] args) {
        Bank b = BankDriver1.getBank();
        b.rateOfInt();
        b.creditCard();
        Bank.IFSC(b);
        if (b instanceof SBI)
            ((SBI)b).Yono();
        else if (b instanceof  Icici)
            ((Icici)b).IMobile();
    }
}
