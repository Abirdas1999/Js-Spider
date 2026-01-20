package com.Java_Core.strings;

public class Demo3 {
    public static void main(String[] args) {
        String s ="Ram@1234T#";
        String up ="";
        String low ="";
        String n ="";
        String sp ="";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch>='a'&& ch<='z'){
                low+=ch;
            } else if (ch>='A'&& ch<='Z') {
                up+=ch;
            } else if (ch>='0'&& ch<='9') {
                n+=ch;
            }else {
                sp+=ch;
            }
        }
            System.out.println(low+up+n+sp);
    }
}
