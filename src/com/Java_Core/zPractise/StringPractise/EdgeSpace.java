package com.Java_Core.zPractise.StringPractise;

public class EdgeSpace {
    public static void main(String[] args) {
        String s = "__java_is__easy__";
        String s2 = "";
        getEdgeSpace(s,s2);

    }
    static void getEdgeSpace(String s,String s2){
        char [] c = s.toCharArray();
            for (int j = 0; j <c.length; j++) {
                if (c[j]>='a' && c[j]<='z'){
                    s2+=c[j];
                }
                if (c[j]==' ' && c[j-1]!=' '){
                    s2+=c[j];
                }
            }
        System.out.println(s2);
    }

}
