package com.Java_Core.Java_8.Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Interf1 {
	void getOccur (String s);
}

class OccurrenceString {

	public static void main (String[] args) {
		String s = "Java is a very very good good programming language Java";

		Interf1 itf = (str) -> {
			List<String> l = Arrays.asList (s.split (" "));
			Map<String, Long> m = l.stream ().collect (Collectors.groupingBy (i -> i, Collectors.counting ()));
			m.forEach ((key, value) -> {
				System.out.println (key + "->" + value);
			});
		};
		itf.getOccur (s);

	}

}
