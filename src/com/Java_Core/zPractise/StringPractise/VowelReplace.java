package com.Java_Core.zPractise.StringPractise;

public class VowelReplace {
    public static void main(String[] args) {
        String s = "umbrella";
        String s2 = "";
        int count = 0;
        getVowelString(s,s2,count);
    }
    static void getVowelString(String s,String s2,int count){
        char [] c = s.toCharArray();
        for (int i = 0; i <c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                count++;
            }
        }
        if (count>=3){
            for (int j = 0; j <c.length; j++) {
                if (c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'){
                    s2+='_';
                }else {
                    s2+=c[j];
                }
            }
            System.out.println(s2);
        }else {
            System.out.println(s);
        }
    }

}
