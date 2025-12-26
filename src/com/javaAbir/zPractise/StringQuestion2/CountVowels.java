package com.javaAbir.zPractise.StringQuestion2;

class CountVowels {
    public static void main(String[] args) {
        String s = "bannana";
        String s2 = "";
        int count = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

}
