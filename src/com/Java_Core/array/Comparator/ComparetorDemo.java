package com.Java_Core.array.Comparator;

import java.util.Arrays;
import java.util.Comparator;

class ComparetorDemo {
    public static void main(String[] args) {
        String [] s = {"Abir","Atif","ShikhaJi","Amit","Xxx","GG","abir"};
        //Arrays.sort(s);//natural sorting
        Arrays.sort(s,new LenCompare());
        System.out.println(Arrays.toString(s));
    }

}

class LenCompare implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s = (String) o1;
        String s2 = (String) o2;
        return s2.length()-s.length();
    }
}
