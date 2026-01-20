package com.Java_Core.strings;

public class InitCap {
    public static void main(String[] args) {
        String s = "Java is easy";
        char[]ch = s.toCharArray();
        String s2 = "";
        for (int i = 0; i <s.length() ; i++) {
            if (i==0||ch[i-1]==' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] -= 32;
                }
            }
            s2+=ch[i];
        }
        System.out.println(s2);
    }
}
