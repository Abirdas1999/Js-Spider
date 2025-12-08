package com.javaAbir.LeetCode;

class ReverseWord {
    public static void main(String[] args) {
        String s = "a good   example ";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String s2 ="";
//        s = s.trim();
        char [] a = s.toCharArray();
        int i =a.length-1;
        int j =a.length-1;
        while (i>=0){
            if (a[i]==' '){
                i--;
                j=i;
                continue;
            }
            while (i>=0 && a[i]!=' ')  i--;
            String t = "";
            for (int k = i+1; k <=j ; k++) {
                t+=a[k];
            }
            s2+=t;
            if (i>=0) s2+=" ";
            i--;
            j=i;
        }

        return s2;
    }
}
