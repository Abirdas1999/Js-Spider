package com.javaAbir.oops.Pollymorphism.RunTime.methodoverriding;
class Animal{
    public void Sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    public void Sound(){
        System.out.println("Dog sound (Bow)");
    }
}

class Cat extends Animal{
    @Override
    public void Sound(){
        System.out.println("Cat Sound (Meow)");
    }
}

class BabyDog extends Dog{
    @Override
    public void Sound(){
        System.out.println("Baby Dog sound(Weep)");
    }
}
public class AnimalDriver {
    static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.Sound();
    }
}
