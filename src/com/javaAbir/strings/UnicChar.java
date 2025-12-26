package com.javaAbir.strings;

class UnicChar {
    public static void main(String[] args) {
        String s ="bannana";
        char [] c  = s.toCharArray();
        String s2 = "";
        for (int i = 0; i <c.length ; i++) {
            int count = 0;
            for (int j = 0; j <c.length ; j++) {
                if (c[i]==c[j]&& i != j ){
                    count++;
                }
            }
            if (count==0){

                s2+=c[i];
            }
        }
        System.out.println(s2);
    }

}
