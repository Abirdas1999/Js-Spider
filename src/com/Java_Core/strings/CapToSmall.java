package com.Java_Core.strings;

public class CapToSmall {
    public static void main(String[] args) {
        String s = "AbP";
        char[]ch=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {

            if (ch[i]>='A'&&ch[i]<='Z'){
                ch[i]+=32;
            } else if(ch[i]>='a'&&ch[i]<='z'){
                ch[i]-=32;
            }

        }
            System.out.println(s);
            System.out.println(ch);
    }
}
