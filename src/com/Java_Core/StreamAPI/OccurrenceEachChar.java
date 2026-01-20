package com.Java_Core.StreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceEachChar {
    public static void main(String[] args) {
        String s = "javadeveloper";
        Map < Character, Long> m = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,()->new HashMap<>(),Collectors.counting()));
        m.forEach((i,j)-> System.out.println(i+" = "+j));
    }

}
