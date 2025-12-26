package com.javaAbir.zPractise.StringQuestion2;

class Anagram {
    public static void main(String[] args) {
        String s = "ava";
        String s2 = "aaab";
        System.out.println(isAnagram(s,s2));
    }
    static boolean isAnagram(String s,String s2){
        while (s.length()==s2.length()){
            if (s.length() == 0 && s2.length() == 0) return true;
            char c = s.charAt(0);
            s=s.replace(c + "", "");
            s2=s2.replace(c + "", "");
        }
        return false;
    }


}
