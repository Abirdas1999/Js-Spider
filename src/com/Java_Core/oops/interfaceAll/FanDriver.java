package com.Java_Core.oops.interfaceAll;
interface Regulator{
    void increasedSpeed();
    void decreasedSpeed();
}
interface Switch{
    void on();
    void off();
}
class Fan implements Regulator,Switch{
    @Override
    public void on(){
        System.out.println("Fan is On");
    }
    @Override
    public void off(){
        System.out.println("Fan is Off");
    }

    @Override
    public void increasedSpeed() {
        System.out.println("Increased Speed");
    }

    @Override
    public void decreasedSpeed() {
        System.out.println("Decreased Speed");
    }
}
public class FanDriver {
    public static void main(String[] args) {
        Regulator r = new Fan();
        r.decreasedSpeed();
        r.increasedSpeed();
        //r.off();
        //r.on();
        Fan f =(Fan) r;
        f.on();
        f.off();

        Switch s = new Fan();
        s.off();
        s.on();
        //s.decreasedSpeed();
        //s.increasedSpeed();

    }
}
