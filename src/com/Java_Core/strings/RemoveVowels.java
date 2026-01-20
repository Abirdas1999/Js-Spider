package com.Java_Core.strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Ramana Kumar";
        char []ch = s.toCharArray();
        String res = "";
        for (int i = 0; i <s.length() ; i++) {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') ch[i]='\u0000';
            res+=ch[i];
        }
        System.out.println(res);
    }
}
