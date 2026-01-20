package com.Java_Core.strings;

public class BalancedString {
    public static void main(String[] args) {
        String s = "{[(hghuhu)]}";
        System.out.println(isBalanced(s));

    }

    static boolean isBalanced(String s ){
        s=removeChars(s);
        while (s.contains("[]")||s.contains("{}")||s.contains("()")){
            s = s.replace("[]","");
            s = s.replace("{}","");
            s = s.replace("()","");
        }
        return s.length()==0;
    }

    static String removeChars(String s){
        String s1 = "";
        for (int i = 0; i <= s.length()-1 ; i++) {
            char c = s.charAt(i);
            if (c=='['||c==']'||c=='{'||c=='}'||c=='('||c==')') s1+=c;
        }
        return s1;
    }

}
