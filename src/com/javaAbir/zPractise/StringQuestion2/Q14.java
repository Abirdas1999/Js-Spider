package com.javaAbir.zPractise.StringQuestion2;

class Q14 {
    public static void main(String[] args) {
        String s = "helloworld";//he121w2r3d
        String s2 = "";
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) count++;
            }

            if (count > 1) {
                for (int j = 1; j <=count ; j++) {
                    s2+=j;
                }
            } else {
                s2 += c[i];
            }


        }
            System.out.println(s2);
    }

}
