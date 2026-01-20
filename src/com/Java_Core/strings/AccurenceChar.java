package com.Java_Core.strings;

public class AccurenceChar {
    public static void main(String[] args) {
        String s = "Programming";
//        char[]ch=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);
            int count = 0;
            boolean counted = false;


            for (int j = 0; j <i ; j++) {
                if (s.charAt(j)==ch){
                    counted=true;
                    break;
                }
            }

            if (counted) continue;

            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j)==ch) count++;
            }
            System.out.println(ch+ " = " +count);
        }
    }

}
