package com.Java_Core.strings;

public class Demo2 {
    public static void main() {
        String s = "Ram@1234T#";
        int up=0,low=0,n=0,sp=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a'&& ch<='z'){
                low++;
            } else if (ch>='A'&& ch<='Z') {
                up++;
            } else if (ch>='0'&& ch<='9') {
                n++;
            }else {
                sp++;
            }

            System.out.println("Upper case count"+up);
            System.out.println("Low case count"+low);
            System.out.println("Number case count"+n);
            System.out.println("Special case count"+sp);


        }
    }
}
