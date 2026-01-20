package com.Java_Core.objectMethods.clone;

public class Address implements Cloneable{
    String city;
    String country;
    public Address(String city,String country){
        this.city=city;
        this.country=country;
    }
    @Override
    public String toString(){
        return "Address [ City = "+city+" Country = "+country+" ]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
