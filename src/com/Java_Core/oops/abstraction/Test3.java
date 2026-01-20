package com.Java_Core.oops.abstraction;
abstract class G{
    abstract public void m1();
   abstract public void m2();
}
abstract class H extends G{
    @Override
    public void m1(){
        System.out.println("M1()--H");
    }
}
class I extends H{
    @Override
    public void m2(){
        System.out.println("M2()--I");
    }
    public void m3(){
        System.out.println("M3()--I");
    }
}
//
public class Test3 {
    public static void main(String[] args){
        //A a = new A();//abstract class can not have object
        G g = new I();
        g.m1();
        g.m2();
        //g.m3();//CCE
        System.out.println("-----");
        H h = new I();
        h.m1();
        h.m2();
        System.out.println("------");
        I i = (I) g;
        i.m2();
        i.m3();
        i.m1();

        System.out.println("------");
        H h1 = (H) g;
        h1.m2();
        //h1.m3();
        h1.m1();

    }
}


