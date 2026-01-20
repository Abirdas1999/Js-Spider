package com.Java_Core.oops.Pollymorphism.CompileTime;
class Student{

    void getStudent(String name){
        System.out.println("Student name is --> "+name);
    }
    void getStudent(String name,int id){
        System.out.println("Student name is --> "+name);
        System.out.println("Student id --> "+id);
    }
    void getStudent(String name,int id,String course){
        System.out.println("Student name is --> "+name);
        System.out.println("Student id --> "+id);
        System.out.println("Student Course --> "+course);
    }

}
class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudent("Abir");
        s.getStudent("Abir",23);
        s.getStudent("Abir",34,"Java");

    }

}
