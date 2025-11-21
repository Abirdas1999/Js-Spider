package com.javaAbir.strings;

public class NextVowel {
    public static void main(String[] args) {
        String s = "java";//oeae
        String s1 = "";
        char [] c = s.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='a'&&c[i]<'a'){
                s1+='e';
            }else if (c[i]=='e'){
                s1+='i';
            }else if (c[i]=='i'){
                s1+='o';
            }else if (c[i]=='o'){
                s1+='u';
            }else{
                if (c[i]<'a'){
                    s1+='a';
                }else if (c[i]<'e'){
                    s1+='e';
                }else if (c[i]<'i'){
                    s1+='i';
                }else if (c[i]<'o'){
                    s1+='o';
                }else if (c[i]<'u'){
                    s1+='u';
                }else {
                    s1+='a';
                }
            }
        }
        System.out.println(s1);
    }

}
