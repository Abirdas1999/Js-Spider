package com.javaAbir.zPractise.StringQuestion2;

class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "java   deve";
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i)==' ') break;
                else if (s.charAt(i) == s2.charAt(j)) count++;

            }
            if (i == 0 || count == 0) s2 += s.charAt(i);
        }
        System.out.println(s2);
    }
    //        for (int i = 0; i < c.length - 1; i++) {
//            if (!s2.contains(s.charAt(i)+"")) s2+=s.charAt(i);
//        }

}
