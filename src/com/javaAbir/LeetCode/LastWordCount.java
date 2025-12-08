package com.javaAbir.LeetCode;

public class LastWordCount {
    public static void main(String[] args) {
        String s = "Hellow World ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        char [] a = s.toCharArray();
        int count = 0;
        for(int i =a.length-1;i>=0;i--){

            if(a[i]==' ' && count==0){
                continue;
            }
            if(a[i]==' '){
                break;
            }
            count++;
        }
        return count;
    }

}
