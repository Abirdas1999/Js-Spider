package com.Java_Core.oops.association.aggregation;
class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
}
public class Company {
    String cname;
    Employee e ;
    Company(String cname,Employee e){
        this.cname=cname;
        this.e=e;
    }
    void display(){
        System.out.println("Employee name is "+e.name+" and the company name is "+cname);
    }
    public static void main(String[] args) {
        Employee e =new Employee("Abir");
        Company c = new Company("TCS",e);//copy constructor
        c.display();
    }

}
