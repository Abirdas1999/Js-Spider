package com.javaAbir.oops.Pollymorphism.RunTime.methodoverriding.binding;
class E{
    public void m1(){
        System.out.println("M1()--A");
    }
}
class G extends E{
    @Override
    public void m1(){
        System.out.println("M1()--B");
    }

    //specific method of G
    public void m2(){
        System.out.println("M2()--B");
    }
}
public class Demo {
    public static void main(String[] args){
        E e = new G(); //B to A
        //up-casting
        e.m1();
        System.out.println("=======");
        // e.m2();
        //down-casting
        G g = (G) e; // A to B
        g.m1();
        g.m2();


    }
}
