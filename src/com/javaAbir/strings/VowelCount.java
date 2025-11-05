package com.javaAbir.strings;

//write a program to convert Vowel char into '_' if vowel count is more than 3...!!


public class VowelCount {
    public static void main(String[] args) {
//        String s = "Education";
        String s = "Java is easy";
        char[] ch = s.toCharArray();
        int count = 0;

        String res = "";

        //for counting the vowel
        for (int i = 0; i < s.length(); i++) {
            if (ch[i]=='A'||ch[i]=='a'||ch[i]=='E'||ch[i]=='e'||ch[i]=='I'||ch[i]=='i'||ch[i]=='O'||ch[i]=='o'||ch[i]=='U'||ch[i]=='u') count++;
            //replacing with '_'...
            if (count>3){
                for (int j = 0; j <s.length() ; j++) {
                    if (ch[j]=='A'||ch[j]=='a'||ch[j]=='E'||ch[j]=='e'||ch[j]=='I'||ch[j]=='i'||ch[j]=='O'||ch[j]=='o'||ch[j]=='U'||ch[j]=='u')ch[j]='_';
                }
            }
                res+=ch[i];
        }
        System.out.println(res);
        System.out.println(ch);
    }

}
