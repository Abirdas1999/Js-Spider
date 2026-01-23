package com.Java_Core.Java_8.Programing;


import java.util.Arrays;
import java.util.List;

interface InterDuplicate {
	void getDuplicate (String s);
}

class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "Java is a very very good good programming language Java";
		InterDuplicate idup = (s2)->{
			List<String > l = Arrays.stream (s2.split (" ")).distinct ().toList ();
			l.forEach (System.out::println);
		};
		idup.getDuplicate (s);

	}


}
