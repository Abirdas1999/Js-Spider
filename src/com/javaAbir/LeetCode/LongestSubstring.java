package com.javaAbir.LeetCode;

public class LongestSubstring {
    public static void main(String[] args) {

        String s = "pwwkew";
        char [] c = s.toCharArray();
        String s2 ="";
        int count = 0;
        int st = 0;
        for(int i = st; i<c.length-1; i++){
            for(int j = i+1;j<c.length-1;j++){
                if(s2.indexOf(c[j])==-1){
                    s2+=(c[i]);
                    if (c[j]!=c[j+1]){
                        st=j+1;
                        break;
                    }
                }
            }
        }
        System.out.println(s2);
    }
}
