package com.Java_Core.LeetCode;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {
        while (s.length()==t.length()) {
            if (s.length() == 0 && t.length() == 0) {
                return true;
            }
            char c = s.charAt(0);
            s = s.replace(c + "", "");
            t = t.replace(c + "", "");
        }
        return false;
    }
}
