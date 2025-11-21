package com.javaAbir.strings;

public class DoubleChar {
    static void main(String[] args) {
        String s = "Success";
        char[] c = s.toCharArray();
        String s2 = "";

        for (int i = 0; i <= c.length - 1; i++){
            if (c[i]==c[i+1]){
                i+=1;
            }
                System.out.print(c[i]);
        }


        System.out.println(s2);
    }
}
