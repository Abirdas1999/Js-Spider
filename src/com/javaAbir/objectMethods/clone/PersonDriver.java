package com.javaAbir.objectMethods.clone;

public class PersonDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Abir",25,new Address("Kolkata","India"));
        Person p2 = (Person) p1.clone();
        p2.address.city="Bhubaneswar";
        p2.name="Boss";
        System.out.println(p1);
        System.out.println(p2);
    }
}
