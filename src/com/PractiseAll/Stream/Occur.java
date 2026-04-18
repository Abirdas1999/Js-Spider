package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Occur {
	public static void main(String[] args) {
	    String s = "bannana";
		getOccourence(s);
	}
	static void getOccourence(String s){
		Map<String,Long> m = Arrays.stream (s.split ("")).collect (Collectors.groupingBy (i->i,Collectors.counting ()));
		m.forEach ((key,value)->{
			System.out.print (key+" -> "+value +" ");
		});
	}

}
