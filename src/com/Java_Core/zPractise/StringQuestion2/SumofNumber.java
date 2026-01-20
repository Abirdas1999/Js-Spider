package com.Java_Core.zPractise.StringQuestion2;

class SumofNumber {
    public static void main(String[] args) {
        String s = "jspider@192";
        int sum = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            if (String.valueOf(s.charAt(i)).matches("[0-9]")){
                sum+=(s.charAt(i)-'0');
            }
        }
        System.out.println(sum);
    }

}
