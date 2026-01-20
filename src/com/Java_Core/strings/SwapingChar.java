package com.Java_Core.strings;

public class SwapingChar {//permutation
    public static void main(String[] args) {
        String s = "abctcfewdfewfvfr";
        getPermutation(s,0,s.length()-1);

//        for (int i = 0; i <=2 ; i++) {
//            String s1 = getSwap(s,0,i);
//            for (int j = 1; j <=2 ; j++) {
//                String s2 = getSwap(s1,1,j);
//                System.out.print(s2+" ");
//            }
//            System.out.println();
//        }
    }
    public static void getPermutation(String s,int st,int ed){
        if (st == ed){
            System.out.print(s+" ");
            return;
        }
        for (int i = st; i <=ed ; i++) {
            String s1 = getSwap(s,st,i);
            getPermutation(s1,st+1,ed);
        }

    }
    public static String getSwap(String s,int i ,int j){
        char[] a = s.toCharArray();
        char temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        return new String(a);

    }

}
