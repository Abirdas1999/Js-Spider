package com.Java_Core.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceWord {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("java","sql","java","sql","js");
        Map<String,Long> m = l.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        m.forEach((i,j)-> System.out.println(i+"="+j));
    }

}
