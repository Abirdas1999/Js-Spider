package com.javaAbir.Collection.Programs;

import java.util.Stack;

//using stack
public class BalancedString {
    public static void main(String[] args) {
//        String s = "{[()]}";
//        String s = "{}()[]";
        String s = "{[(]})";
//        String s = "{";
//        String s = "";
        System.out.println(isBalanced(s));
    }
    static boolean isBalanced(String s){
        Stack <Character> str = new Stack<>();
        //if (s.length()==0) return false;//adding this logic
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch=='('||ch=='{'||ch=='['){
                str.push(ch);
            } else if (ch==')'||ch=='}'||ch==']') {
                if (str.isEmpty())return false;
                char ch1 = str.pop();
                if (!isPair(ch1,ch)) return false;
            }
        }
        return  str.isEmpty();
    }
    static boolean isPair(char ch1,char ch){
        if (ch1=='(' && ch==')'||ch1=='{' && ch=='}'||ch1=='[' && ch==']') return true;
        return false;
    }

}
