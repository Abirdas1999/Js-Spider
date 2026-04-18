package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class MaxCount {
	public static void main(String[] args) {
		String s = "bannana";
		getMax(s);
	}
	static void getMax(String s){
		Map<String,Long> m = Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ()));
		Long max = m.values ().stream().min (Long::compare).get ();
		m.forEach ((key,value)->{
			if (max == value) System.out.print (key+" -> "+value +" ");
		});
	}
}
