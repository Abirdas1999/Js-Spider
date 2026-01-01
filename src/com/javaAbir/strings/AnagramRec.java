package com.javaAbir.strings;

class AnagramRec {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));

    }
    public static boolean isAnagram(String s1,String s2){
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }
        char c = s1.charAt(0);
        if (s1.length()==s2.length()) {
            s1 = s1.replace(c + "", "");
            s2 = s2.replace(c + "", "");
        }
        isAnagram(s1,s2);
        return false;

    }

}
