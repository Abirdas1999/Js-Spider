package com.javaAbir.zPractise.Practise;

public class SecSmallest {
    public static void main(String[] args) {
        int [] a ={3,6,10,8,5,7,4,3};
        int s = a[0];
        int s2 = a[0];
        //int s3 = a[1];--->SIR

        for (int i = 1; i <a.length ; i++) {
            if (a[i]==s) continue;
            if (a[i]<s){
                s2=s;
                s = a[i];
            } else if (a[i]<s2||s==s2){
                s2=a[i];
            }
        }
        System.out.println(s2);
    }

}
