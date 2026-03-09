package com.Java_Core.Java_8.Programing;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface InterDuplicate {
	void getDuplicate (String s);
}

class RemoveDuplicate {
//	public static void main(String[] args) {
//		String s = "Java is a very very good good programming language Java";
//		InterDuplicate idup = s2 ->{
//
//			Arrays.stream (s2.split (" ")).distinct ().forEach (System.out::println);//-->output is String
//
////			List<String > l = Arrays.stream (s2.split (" ")).distinct ().toList ();//---> output is list
////			l.forEach (System.out::println);
//		};
//		idup.getDuplicate (s);
//
//
//	}


//	fully functional interface method
	public static void main(String[] args) {

		String s = "Java is a very very good good programming language Java";

		// Consumer takes input but returns nothing
		Consumer<String> idup = s2 -> {
			Arrays.stream(s2.split(" ")).distinct().forEach(System.out::println);
		};

		// Consumer method is accept()
		idup.accept(s);
	}


}
