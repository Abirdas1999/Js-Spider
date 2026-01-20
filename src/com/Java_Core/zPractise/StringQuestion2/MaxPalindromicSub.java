package com.Java_Core.zPractise.StringQuestion2;

class MaxPalindromicSub {
    public static void main(String[] args) {
        getSubstring("madam");
    }

    static void getSubstring(String s) {
        String temp = "";
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            String s2 = "";

            for (int j = i; j < s.length(); j++) {
                int k = 0;
                s2 += s.charAt(j);
                if (isPalindrome(s2)) {
                    k = s2.length();
                }
                if (k > count) {
                    count = k;
                    temp = s2;
                }

            }

        }
        System.out.println("Biggest SubString is--> " + temp + " --> " + count);

    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }
}
