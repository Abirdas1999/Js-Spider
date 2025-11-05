package com.javaAbir.strings;

public class WordCount {
    public static void main(String[] args) {
        String s = "JAva is easy";
        int count =0;
        char[]ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!= ' ' &&(i==0||s.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
