package com.javaAbir.zPractise.StringQuestion2;

class CharOccur {
    public static void main(String[] args) {
        String s = "banana";
        int sum = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            int count = 0;
            String s2 = "";
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j)==s.charAt(i))count++;
                else s2+=s.charAt(j);
            }
            System.out.print(s.charAt(i)+" --> "+count+" ");
            s = s2;
        }
    }
}
