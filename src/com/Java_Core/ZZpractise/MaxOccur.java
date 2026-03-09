package com.Java_Core.ZZpractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@FunctionalInterface
interface I{
	void getMax();
}
class MaxOccur {
	public static void main(String[] args) {
	    String s = "bannnana";
		I i = ()->{
			Arrays.stream (s.split ("")).collect (Collectors.groupingBy (e->e,Collectors.counting ())).entrySet ().stream ().max (Map.Entry.comparingByValue ()).ifPresent (e-> System.out.println (e.getKey ()+" --> "+e.getValue ()));
		};
		i.getMax ();
	}

}
