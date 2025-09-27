package com.javaAbir.oops.methodoverriding;
class AA {
    Animal m1(){
        System.out.println("M1()--> AA");
        return  new Animal();
    }
}

class BB {
    protected Dog m1(){
        System.out.println("M1()--> AA");
        return  new Dog();
    }
}

class CC {
    public BabyDog m1(){
        System.out.println("M1()--> AA");
        return  new BabyDog();
    }
}
public class AnimalMethodDriver {

    static void main(String[] args) {
        BabyDog b1 = new BabyDog();

    }

}
