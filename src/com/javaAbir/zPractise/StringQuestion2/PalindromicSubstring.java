package com.javaAbir.zPractise.StringQuestion2;



class PalindromicSubstring {
    public static void main(String[] args) {
        getSubstring("madam");
    }

    static void getSubstring(String s) {
        String check ="";

        for (int i = 0; i < s.length(); i++) {
            String s2 = "";
            s2 += s.charAt(i);
            if (isPalindrome(s2) && !check.contains(s2+",")){
                System.out.println(s2);
                check+=s2+",";
            }
            for (int j = i + 1; j < s.length(); j++) {
                s2 += s.charAt(j);
                if (isPalindrome(s2) && !check.contains(s2+",")) {
                    System.out.println(s2);
                }
            }
        }
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
