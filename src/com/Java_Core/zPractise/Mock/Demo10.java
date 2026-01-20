package com.Java_Core.zPractise.Mock;

public class Demo10 {
    public static void main(String[] args) {
        String s = "java    is opp";
        String s2 = "";
        char [] c = s.toCharArray();
        int ed = c.length-1;
        for (int i = c.length-1; i >=0 ; i--) {
            if (c[i] == ' ' && i > 0 && c[i - 1] == ' ') {
                continue;
            }
            if (c[i]==' '){
                for (int j = i+1; j <=ed ; j++) {
                    s2+=c[j];
                }
                s2+=" ";
                ed =i-1;
            }
            if (i == 0) {
                for (int j = 0; j <= ed; j++) {
                    s2 += c[j];
                }
            }
        }
        System.out.println(s2);
    }

}
