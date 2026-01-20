package com.Java_Core.LeetCode;

public class RemovePalindromicSequences {
    public static void main(String[] args) {
        String s = "ababa";
        int count = 0;
        System.out.println(removePalindromeSub(s,count));
    }
    public static int removePalindromeSub(String s,int count) {
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;

            }
            if (s.charAt(i) != s.charAt(j)) {
                if (s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0, j) + s.substring(j + 1);
                    count++;
                    i--;
                    j++;

                } else if (s.charAt(j) == s.charAt(j+1)){
                    s = s.substring(0, i) + s.substring(i + 1);
                    count++;
                    i--;
                    j++;

                }

            }

        }
        return count;
    }

}
