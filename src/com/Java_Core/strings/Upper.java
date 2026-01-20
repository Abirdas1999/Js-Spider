package com.Java_Core.strings;

public class Upper {
    public static void main(String[] args) {
        String s = "Java is A oPp languAge";
        String s2 = "";
        char[]ch = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if (ch[i]>=97){
                s2+=ch[i];
            }else if(ch[i]==' ') {
                s2+=ch[i];
            }else {
                ch[i]+=32;
                s2+=ch[i];

            }
        }
        System.out.println(s2);
    }

}
