package com.javaAbir.oops.abstraction;
abstract class ATM {
    abstract void withdraw(int amount);
}
class SBI extends ATM{
    int bal;
    public SBI(int bal){
        this.bal=bal;
    }
    @Override
    void  withdraw(int amount){
        if(amount<bal){
            bal-=amount;
            System.out.println(amount + " Withdraw complete");
            System.out.println(bal+" is available Balance");
        }else {
            System.out.println("Insuficient Balance");
        }
    }
}
class ICICI extends ATM{
    int bal;
    public ICICI(int bal){
        this.bal=bal;
    }
    @Override
    void  withdraw(int amount){
        if(amount<=bal){
            bal-=amount;
            System.out.println(amount + " Withdraw complete");
            System.out.println(bal+" is available Balance");
        }else {
            System.out.println("Insuficient Balance");
        }
    }
}
class AXIS extends ATM{
    int bal;
    public AXIS(int bal){
        this.bal=bal;
    }
    @Override
    void  withdraw(int amount){
            bal-=amount;
            System.out.println(amount + " Withdraw complete");
            System.out.println(bal+" is available Balance");
    }
}
public class User {
    public static void main(String[] args){
        ATM a ;
        a = new SBI(2000);
        a.withdraw(1999);
        System.out.println("------");
        a = new ICICI(3000);
        a.withdraw(3000);
        System.out.println("------");
        a = new AXIS(1000);
        a.withdraw(2000);

    }
}
