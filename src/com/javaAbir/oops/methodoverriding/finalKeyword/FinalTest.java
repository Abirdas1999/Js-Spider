package com.javaAbir.oops.methodoverriding.finalKeyword;
public class FinalTest {
    final int i;
//    final static int j; blank final variable
    FinalTest(int i){
        this.i=i;
    }

    public static void main(String[]args) {
        final int k =10;
        //k+=5; --> compile time error...we cant modify final var.
        FinalTest f1 = new FinalTest(100);
        System.out.println(f1.i+" 1st obj-- Static i");
       // f1.i+=5; compile time error...we cant modify final var.
        FinalTest f2 = new FinalTest(200);
       // f2.i+=100;  compile time error...we cant modify final var.

        System.out.println(f2.i+" 2nd obj-- Static i");


    }
}
