package com.javaAbir.LeetCode;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){
            while (s.contains("()") || s.contains("{}") || s.contains("[]")){
                s = s.replace("()","");
                s = s.replace("{}","");
                s = s.replace("[]","");
            }
            if(s.length()==0){
                return true;
            }else{
                return false;
            }


    }

}
