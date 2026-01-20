package com.Java_Core.zPractise.Mock;

public class Demo9 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int i = 1; i <=n ; i++) {

            if (i%2!=0){
                for (int j = 1; j <=i ; j++) {
                    System.out.print(count+" ");
                    count++;
                }
            }else {
                int temp=count+(i-1);
                for (int j = 1; j <=i ; j++) {
                    System.out.print(temp+" ");
                    temp--;
                }
                count+=i;
            }
            System.out.println();
        }
    }

}
