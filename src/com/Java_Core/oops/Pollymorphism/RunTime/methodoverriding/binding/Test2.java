package com.Java_Core.oops.Pollymorphism.RunTime.methodoverriding.binding;
class AA{

}
class BB extends AA{

}
class CC {
    public void m1(AA aa){
        System.out.println("M1()--c");
    }

    public void m1(BB bb){
        System.out.println("M1()--c");
    }
}
class DD extends  CC{
    @Override
    public void m1(AA aa){
        System.out.println("M1()--D");
    }
    @Override
    public void m1(BB bb){
        System.out.println("M1()--D");
    }
}
public class Test2 {

    public static void main(String[] args){
        AA aa = new AA();
        BB bb = new BB();
        AA aa1 = new BB();

        CC cc = new DD();
        cc.m1(aa);//late binding
        cc.m1(bb);//late binding
        cc.m1(aa1);//late binding
        System.out.println("-------");

    }
}
