package com.Java_Core.zPractise.StringQuestion2;

class RemoveVowel {
    public static void main(String[] args) {
        String s = "apple";
        String s2 = "";
        for (int i = 0; i <s.length() ; i++) {
            if (!(String.valueOf(s.charAt(i)).matches("[aeiouAEIOU]"))) s2+=s.charAt(i);

        }
        System.out.println(s2);
    }


}
