package com.Java_Core.Java_8.Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class OccurrenceWords {


	public static void main(String[] args) {
		List<String> l = Arrays.asList ("Abir","Abir","Mona","Mona","Chandra");
		Map<String,Long> m =  l.stream ().collect(Collectors.groupingBy (i->i,Collectors.counting ()));
		m.forEach ((k,v)->{
			System.out.println (k+"-->"+v);
		});
	}



}
