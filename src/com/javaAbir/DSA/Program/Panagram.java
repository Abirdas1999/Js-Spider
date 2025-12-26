package com.javaAbir.DSA.Program;

class Panagram {
    public static void main(String[] args) {
        System.out.println(isPanagram("bcdefgh ijkl mNop qrst uvwxyz djF"));
    }

    static boolean isPanagram(String s) {
        s = s.toLowerCase();
        if (s.length() < 26) return false;
        for (char i = 'a'; i <= 'z'; i++) {
            if (!s.contains(i + "")) return false;
        }
        return true;
    }

}
