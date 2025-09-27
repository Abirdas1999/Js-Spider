package com.javaAbir.oops.methodoverriding.instenceof;
class Animal{
    public void eat(){
        System.out.println("Animal eating....");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog eating....");
    }
    public void bark(){
        System.out.println("Dog barking....");
    }
}
class BabyDog extends Dog{
    @Override
    public void eat(){
        System.out.println("Baby-Dog eating....");
    }
    @Override
    public void bark(){
        System.out.println("Baby-Dog barking....");
    }
    public void weep(){
        System.out.println("Baby-Dog weeping....");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat eating....");
    }
    public void sound(){
        System.out.println("Cat meow....");
    }
}
public class AnimalDriver {
   public static void main(String[] args){
//       Animal a = new BabyDog();//upcasting baby-dog to animal
//       a.eat();
//       //a.bark();//can not access subclass specific method
//
//       //downcasting Animal to dog
//       Dog d = (Dog) a;
//       d.bark();
//       d.eat();
//       //d.weep()// ❌can not access
//       System.out.println("-----------");
//      //down-casting animal to baby-dog
//       BabyDog bd = (BabyDog) a;
//       bd.bark();
//       bd.eat();
//       bd.weep();//Now accessible ✅
//       //Cat c = (Cat) a;//there is no up casting so it through cce

       //🔅interface🌀

       Animal a = new Dog();
       System.out.println(a instanceof Animal);
       System.out.println(a instanceof Dog);
       System.out.println(a instanceof BabyDog);
       System.out.println(a instanceof Cat);
       System.out.println("-------");
       a=new BabyDog();
       System.out.println(a instanceof Animal);
       System.out.println(a instanceof Dog);
       System.out.println(a instanceof BabyDog);
       System.out.println(a instanceof Cat);




   }

}
