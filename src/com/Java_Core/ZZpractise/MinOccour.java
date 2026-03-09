//package com.Java_Core.ZZpractise;
//import java.util.Arrays;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//interface Occur{
//	void getOccur(String s);
//}
//class MinOccour {
//	public static void main(String[] args) {
//	    String s = "bannana";
//		Occurence o = (str)->{
//			Arrays.stream (str.split ("")).collect (Collectors.groupingBy (c->c,Collectors.counting ())).entrySet ().stream ().min (Map.Entry.comparingByValue ()).ifPresent (e -> System.out.println(e.getKey () + " --> "+e.getValue ()));
//		};
//		o.getOccur (s);
//	}
//
//}
