package com.javaAbir.MultiTreading.TreadClass;
class MyTread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Thread() :"+i);
        }
    }
}
class Demo {
    public static void main(String[] args) {
        MyTread m = new MyTread();//new thread is created
        m.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("main() :"+i);
        }

    }


}
