package com.javaAbir.StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceString {
    public static void main(String[] args) {
        String s = "java is verry verry easy java";
        String[] split = s.split(" ");
        List <String> l = Arrays.asList(split);
        Map<String, Long> m = l.stream().collect(Collectors.groupingBy(i -> i, () -> new LinkedHashMap<String, Long>(), Collectors.counting()));
        m.forEach((i,j)-> System.out.println(i+"="+j));;
    }

}
