package com.javaAbir.oops.interfaceAll.javaBean;
import java.io.Serializable;

interface Collage{
    String getName();
    void setName(String name);
}
//java beanClass
class Students implements Collage, Serializable{//✅️1️⃣Rules
    private String name;//✅️2️⃣Rules
    private int id;
    private int age;

    public Students(){//✅️3️⃣Rules
        System.out.println("Student obj is created...");
    }
    @Override
    public String getName(){//✅️4️⃣Rules
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void display(){
        System.out.println("Student details:\nname:"+name+" age:"+age+" id:"+id);
    }
}
class Demo {
   public static void main(String[] args) {
       Students s = new Students();
       s.setAge(23);
       s.setId(2122);
       s.setName("Abir");
       s.display();
    }
}
