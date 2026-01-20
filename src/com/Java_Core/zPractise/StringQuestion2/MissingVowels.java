package com.Java_Core.zPractise.StringQuestion2;

class MissingVowels {
    public static void main(String[] args) {
        getVowel("madam","aeiou");
    }

    static void getVowel(String s,String s2) {
        String temp = "";

        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s2.charAt(i)==s.charAt(j)){
                    temp+=s2.charAt(i);
                    break;
                }
            }
        }
        System.out.println(s2.replace(temp,""));
    }


}
