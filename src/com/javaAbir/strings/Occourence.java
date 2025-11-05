package com.javaAbir.strings;

public class Occourence {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "";
        while (s1.length()>0){
            char ch = s1.charAt(0);
            s2 = s1.replace(ch+"","");
            System.out.println(ch +"="+ (s1.length() - s2.length()));
            s1=s2;
        }
    }
}
