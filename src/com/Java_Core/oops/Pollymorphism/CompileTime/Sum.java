package com.Java_Core.oops.Pollymorphism.CompileTime;

class Sum {
    static int Sum(int x,int y){
        return x+y;
    }
    static int Sum(int x,int y,int z){
        return x+y+z;
    }
    static double Sum(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,40));
        System.out.println(Sum(20.3,40.12));

    }

}
