package com.Java_Core.strings;

//write a program to convert consecutive char into '&'...!!

public class ConvertConsiqutive {
    public static void main(String[] args) {
        String s = "Boss";
        char[]ch = s.toCharArray();
        String res = "";

        //Abir---************************************
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i+1; j <s.length() ; j++) {
//                if (ch[i]==ch[j]) ch[j] ='&';
//                j++;
//            }
//            res+=ch[i];
//        }


        //Satya-------****************************
        for (int i = 0; i < s.length()-1 ; i++) {
            if (ch[i]==ch[i+1]) ch[i+1] ='&';
            res+=ch[i];

        }
//        System.out.println(res);
//        System.out.println(res.length());
        System.out.println(ch);
        System.out.println(ch.length);

    }
}
