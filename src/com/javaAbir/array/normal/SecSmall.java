package com.javaAbir.array.normal;

public class SecSmall {
    public static void main(String[] args) {
        int [] a = {1,1,4,1,7,8,9};
        int small = a[0];
        int SecSmall = a[1];

        for (int i = 0; i < a.length ; i++) {

            if (a[i]<small){
                SecSmall = small;
                small = a[i];
            } else if (a[i] > small && a[i] < SecSmall ||SecSmall==small){
                SecSmall = a[i];
            }
        }
        System.out.println(SecSmall);
    }

}
