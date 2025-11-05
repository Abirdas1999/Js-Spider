package com.javaAbir.recursion.renge;

import java.util.Scanner;

public class FibRenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number--> ");
        int count = sc.nextInt();
        FibRen(0,1,count);
    }

    static void FibRen(int st, int ed, int count) {
        if (count==0) return;
        System.out.print(st+" ");
        FibRen(ed,(st+ed),count-1);
    }
}
