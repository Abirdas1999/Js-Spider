package com.Java_Core.strings;

public class Shorting {
    public static void main(String[] args) {
        String s = "jspiders";
        char[]ch=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length()-1 ; j++) {
                if (ch[i]>ch[j]){

                    //swaping program for swapp char in a String...
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(ch);
    }
}
