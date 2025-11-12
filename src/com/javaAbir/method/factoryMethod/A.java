package com.javaAbir.method.factoryMethod;

class A {
    int i =10;
    int j =20;
}
class B{
    int i = 30;
    int j = 40;

}
class C{
     static A m1(){
        return new A();
    }
    static B m2(){
         return new B();
    }
//    public static void main(String[] args) {
////        A a = m2();//not the b type
//        A a = m1();
//        B b = m2();
//        System.out.println(a.i+" "+a.j);
//        System.out.println(b.i+" "+b.j);
//
//    }
}
class Demo{
   public static void main(String[] args) {
       C c = new C();
//       c.m2();
       System.out.println(c.m2().i+" ");

    }
}
