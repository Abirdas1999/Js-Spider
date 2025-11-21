package com.javaAbir.zPractise.string;

import java.util.Scanner;

public class RevSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence--> ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        String s2 = "";
        for (int i = a.length-1; i >=0 ; i--) {
            s2+=a[i];
            if (i>0) s2+=" ";
            
        }
        System.out.println(s2);
}

}
