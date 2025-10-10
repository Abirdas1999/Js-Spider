package com.javaAbir.strings;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "Java is very easy";
        int i = 0;
        int j = 0;
        String res = "";

        while (j < s.length()) {
            // move j until space or end of string
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }

            // reverse the word between i and j-1
            int k = j - 1;
            while (k >= i) {
                res += s.charAt(k);
                k--;
            }

            res += " ";

            // move to next word
            j++;
            i = j;
        }

        System.out.println(res);
    }
}
