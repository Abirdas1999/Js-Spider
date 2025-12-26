package com.javaAbir.zPractise.StringQuestion2;

import java.util.Arrays;

class ShortChar {
    public static void main(String[] args) {
        String s = "amit";
        String s2 = "";
        char [] c = s.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            for (int j = i+1; j <c.length ; j++) {
                if (c[i]>c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (char a:c) s2+=a;
        System.out.println(s2);
    }

}
