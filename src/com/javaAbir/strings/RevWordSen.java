package com.javaAbir.strings;

public class RevWordSen {
    static void main(String[] args) {
        String s = "Hello world Hello";
//        String s = "Helloa";
        char[] c = s.toCharArray();
        String s2 = "";

        for (int i = 0; i <= c.length - 1; i++)
        {
            if (c[i] == 'l' && c[i + 1] == 'l' && c[i + 2] == 'o'){
                i+=2;
                s2+="xx";
            }else {
                s2+=c[i];
            }
        }
        System.out.println(s2);
    }
}
