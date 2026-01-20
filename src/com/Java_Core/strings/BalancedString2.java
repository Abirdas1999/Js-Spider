package com.Java_Core.strings;

public  class BalancedString2 {

    public static void main(String[] args) {
        String s = "[{}aq3]";

        s = s.replaceAll("[a-zA-Z0-9]", "");

        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");

        }
        if (s.isEmpty()) {
            System.out.println("Balanced String");
        } else {
            System.out.println("Not balanced");
        }
    }
}
 
    

