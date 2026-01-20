package com.Java_Core.zPractise.StringQuestion2;

class Panagram {
    public static void main(String[] args) {
//        System.out.println(isPanagram(" The quick brown fox jumps over the lazy dog"));
        System.out.println(isPanagram(" ab"));
    }

    static boolean isPanagram(String s) {
        s = s.toLowerCase();
        String s2 = "abcdefghijklmnopqrstuvwxyz";
        while (s2.length() != 0) {
            char c = s2.charAt(0);
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    flag = true;
                    s2 = s2.replace(c + "", "");
                    break;
                }
            }
            if (!flag) return false;
        }
        return true;
    }

}
