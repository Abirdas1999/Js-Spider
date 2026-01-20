package com.Java_Core.zPractise.StringQuestion2;

class ConvertLowUpper {
    public static void main(String[] args) {
        String s = "jSideR@192";
        String s2 = "";
        for (int i = 0; i <= s.length()-1 ; i++) {
            if (String.valueOf(s.charAt(i)).matches("[a-z]")){
                s2+=(char)(s.charAt(i)-32);
            } else if (String.valueOf(s.charAt(i)).matches("[A-Z]")) {
                s2+=(char)(s.charAt(i)+32);
            }else {
                s2+=s.charAt(i);
            }

        }
        System.out.println(s2);
    }

}
