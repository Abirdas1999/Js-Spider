package com.javaAbir.zPractise.StringQuestion2;

class ReverseString {
    public static void main(String[] args) {
        String s = "jspider";
        String s2 = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            s2+=s.charAt(i);
        }
        System.out.println(s2);
    }

}
