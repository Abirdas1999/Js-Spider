package com.Java_Core.zPractise.StringQuestion2;

class InitCap {
    public static void main(String[] args) {
        String s = "JAva is a opps lang";
        String s2 = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                if (String.valueOf(s.charAt(i)).matches("[a-z]")) s2 += (char) (s.charAt(i) - 32);
                else s2+=s.charAt(i);
            } else {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);


    }

}
