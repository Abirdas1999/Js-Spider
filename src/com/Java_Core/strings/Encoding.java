package com.Java_Core.strings;

public class Encoding {
    public static void main(String[] args) {
        System.out.println(getEncode("atif",2));

    }
    static String getEncode(String s , int level){
        char [] alfa = "abcdefghijklmnopqrstwxyz".toCharArray();
        String s1 = "";
        char[] a = s.toCharArray();

        for (int i = 0; i <a.length ; i++) {
            int index = a[i]-'a';
            index+=level;
            index = index%26;
            s1+=alfa[index];
        }
        return s1;
    }

}
