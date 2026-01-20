package com.Java_Core.oops.Pollymorphism.RunTime.methodoverriding;
class Bank{
    int getRateOfInt(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    public int getRateOfInt(){
        return 10;
    }
}

class ICICI extends Bank{
    @Override
     int getRateOfInt(){
        return 11;
    }
}

class AXIS extends Bank{
    @Override
    protected int getRateOfInt(){
        return 9;
    }
}
public class BankDriver {
    static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
//        Bank b = new Bank();
        System.out.println(s.getRateOfInt());
        System.out.println(i.getRateOfInt());
        System.out.println(a.getRateOfInt());
//        System.out.println(b.getRateOfInt());

    }
}

