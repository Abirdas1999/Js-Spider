package com.Java_Core.zPractise.StringQuestion2;

class RevWordSen {
    public static void main(String[] args) {
        String s = "jspider   @192";
        char[] c = s.toCharArray();
        String s2 = "";
        int k = 0;
        for (int i = 0; i < c.length - 1; i++) {

            while (c[i] == ' ' && c[i+1] == ' ') i++;
            if (c[i] == ' ' || i == c.length-1) {
                for (int j = i - 1; j >= k; j--) {
                    s2 += c[j];
                }
                if (i < c.length) s2 += " ";
                k = i+1;
            }
        }
        for (int j = c.length - 1; j >= k; j--) {
            s2 += c[j];
        }
        System.out.println(s2);
    }

}
