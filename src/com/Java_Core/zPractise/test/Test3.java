package com.Java_Core.zPractise.test;

public class Test3 {
    public static void main(String[] args) {
        String s = "java is easy";
        char [] a = s.toCharArray();
        String s2 ="";
        int temp = 0;

        for (int i = 0; i <a.length; i++) {
            if ( a[i]==' '|| i == a.length-1) {
                for (int j=i-1; j >= temp; j--) {
                    s2 += a[j];
                }
                if (a.length!=i){
                    s2+=" ";
                    i++;
                    temp =i;
                }
            }
        }
        System.out.println(s2);
    }

}
