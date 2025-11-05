package com.javaAbir.strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("jspider -> " + isPalindrome("jspider"));
        System.out.println("mam -> " + isPalindrome("mam"));
        System.out.println("malayalam -> " + isPalindrome("malayalam"));
        System.out.println("madam -> " + isPalindrome("madam"));
        System.out.println("Null-->"+isPalindrome(""));//here is the problem it take null value;
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
