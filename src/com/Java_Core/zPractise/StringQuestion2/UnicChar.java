package com.Java_Core.zPractise.StringQuestion2;

class UnicChar {
    public static void main(String[] args) {
        System.out.println(getUnic("baa  ggccc"));
    }

    static String getUnic(String s) {
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') continue;
            int count = 0;
            for (int j = 0; j <s2.length() ; j++) {
                if (s.charAt(i)==s2.charAt(j))count++;
            }
            if (count==0)s2+=s.charAt(i);
        }
        return s2;
    }
}
