package com.javaAbir.strings;

public class ReverceSentence {
    public static void main(String[] args) {
            String s = "This is JAVA ";
            int i =s.length()-1;
            int j=s.length()-1;
            String res = "";
            while (j>=0){
                // move j backward
                while (j>=0 && s.charAt(j) !=' '){
                    j--;
                }
                //set the word
                int k = j + 1;//for removing space from the word while come from searching...
                while (k <= i) {
                    res += s.charAt(k);
                    k++;
                }
                //giving the space...
                res += " ";

                // move to next word
                j--;
                i = j;
            }

            System.out.println(res);


    }
}
