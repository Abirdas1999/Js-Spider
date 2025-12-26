package com.javaAbir.zPractise.StringQuestion2;

class MinOccurChar {
    public static void main(String[] args) {
        System.out.println(getMinOccrud("aabccc"));
    }

    static String getMinOccrud(String s) {
        int min = s.length();
        char a = ' ';
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count++;
            }
            if (count < min) {
                min = count;
                a = s.charAt(i);
            }

        }
        return "Minimum Occurrence -->" + a + " ==>" + min;
    }

}
