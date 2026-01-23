package com.Java_Core.Java_8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Marks {
	 public static void main(String[] args) {

		 ArrayList<Integer> a = new ArrayList<> ();
		 a.add (30);
		 a.add (40);
		 a.add (44);
		 a.add (49);
		 a.add (38);
		 a.add (8);
		 a.add (68);
		 System.out.println (a);

//		 ArrayList<String> a = new ArrayList<> ();
//		 a.add ("Abir Das");
//		 a.add ("Banty Deshpandey");
//		 a.add ("Mona Roy");
//		 a.add ("Bunny Deol");
//		 a.add ("Chandra Shetty");
//		 System.out.println (a);

		 //check
//		 List<Integer> l =  a.stream ().filter (i->i>=40).collect (Collectors.toList ());

		 //add map
//		 List<Integer> l =  a.stream ().map (i->i+5).collect (Collectors.toList ());

		 //count
//		 long l =  a.stream ().filter (i->i<40).count ();

		 //sort
//		 List<Integer> l =  a.stream ().filter (i->i>=40).sorted ().collect (Collectors.toList ());

		 //comparator
//		 List<Integer> l =  a.stream ().filter (i->i>=40).sorted ((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0).collect (Collectors.toList ());

		 //comparator
//		 List<String> l =  a.stream ().sorted ((i1,i2)->(i2.compareTo (i1))).collect (Collectors.toList ());
//		 List<String> l =  a.stream ().sorted ((i1,i2)->(-i2.compareTo (i1))).collect (Collectors.toList ());


		 //comparator-->******
//		 Comparator<String> c = (s1,s2)->{return (s1.length ())<(s2.length ())?1:(s1.length ())>(s2.length ())?-1:s1.compareTo (s2);};
//		 List<String> l =  a.stream ().sorted (c).collect (Collectors.toList ());



		 //min & max using comparator
//		 Integer l =  a.stream ().min ((i1, i2)->i1.compareTo (i2)).get ();
//		 Integer l2 =  a.stream ().max ((i1, i2)->-i1.compareTo (i2)).get ();
//		 System.out.println (l2);


		 //forEach()
//		 Consumer <Integer> f = i-> System.out.println ("The Square "+i*i);
//		 a.stream ().forEach (f) ;


//		 //toArray()
//		 Integer [] i = a.stream ().toArray (Integer[]::new);
//		 Stream.of (i).forEach (System.out::println);//here convert array into stream...
//		 for (Integer x:i) System.out.print (x+" ");


		 //Stream
//		 Stream<Integer> s = Stream.of (2,34,445,5555,543949,55664934);
//		 s.forEach (System.out::println);

		 Integer[] x = {45,5,6,67,8,3};
		 Stream.of(x).forEach (System.out::println);



//		 System.out.println (l);
	 }

}
