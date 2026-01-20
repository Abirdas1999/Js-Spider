package com.Java_Core.zPractise.pattern;

public class CharPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            //star
            int a = 65;
            for (int j = 1; j <=i ; j++) {
                char b = (char)a;
                if (i%2!=0) {
                    System.out.print(b+"  ");
                    a+=1;
                }else  {
                    System.out.print(j+"  ");
                }
            }
            System.out.println();

        }
    }
//public static void main(String[] args) {
//    int n = 5;
//    for (int i = 1; i <=n ; i++) {
//        //space
//        for (int j = 1; j <=n-i ; j++) {
//            System.out.print("   ");
//        }
//        //char
//        char a ='A';
//        for (int j = 1; j <=i ; j++) {
//            if (i%2!=0) {
//                System.out.print(a+"  ");
//                a++;
//            }else  {
//                System.out.print(j+"  ");
//            }
//        }
//        System.out.println();
//
//    }
//}
}
