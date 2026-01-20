package com.Java_Core.objectMethods.clone;

public class Person implements Cloneable{
    String name;
    int age;
    Address address;

    public Person(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String toString(){
        return "Person[ Name = "+name+" Age = "+age+" Address = "+address+" ]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Person p = (Person) super.clone();
        p.address = (Address) address.clone();
        return p;
    }
}
