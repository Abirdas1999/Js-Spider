package com.javaAbir.zPractise.StringQuestion2;

class SecMinimumOccur {
    public static void main(String[] args) {
        System.out.println(getSecMinOccrud("baaccc"));
    }

    static String getSecMinOccrud(String s) {
        int min = s.length();
        int min2 = s.length();
        char a = ' ';
        char b =' ';
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count++;
            }

            if (count < min) {
                min2 = min;
                b = a;

                min = count;
                a = s.charAt(i);
            }else if (count < min2 && count > min) {
                min2 = count;
                b = s.charAt(i);
            }

        }
        return "Minimum Occurrence -->" + b + " ==>" + min2;
    }

}
