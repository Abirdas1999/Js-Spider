package com.Java_Core.zPractise.StringQuestion2;

class CountUpperLowerSp {
    public static void main(String[] args) {
        String s = "BannanA@#!";
        int up = 0;
        int low = 0;
        int sp = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            if (String.valueOf(s.charAt(i)).matches("[a-z]"))low++;
            else if (String.valueOf(s.charAt(i)).matches("[A-Z]"))up++;
            else sp++;
        }
        System.out.println("Upper--> "+up+", Lower--> "+low+", Special --> "+sp);
    }
}
