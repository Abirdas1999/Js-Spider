package com.javaAbir.practise.pattern;

public class RevPyramid2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print("   ");

            }
            //star
            for (int j = 1; j <=(2*n)-(2*i-1) ; j++) {
                if (j==1||j==(2*n)-(2*i-1)||i==1){
                    System.out.print("*  ");

                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }



//        int st = 2*n-1;
//        int sp = 0;
//
//        for (int i = 1; i <=n ; i++) {
//            //space
//            for (int j = 1; j <=sp ; j++) {
//                System.out.print("   ");
//            }
//            //star
//            for (int j = 1; j <=st ; j++) {
//                if (j==1||j==st||i==1){
//                System.out.print("*  ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            sp++;
//            st-=2;
//            System.out.println();
//
//        }
    }
}
