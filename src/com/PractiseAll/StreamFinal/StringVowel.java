package com.PractiseAll.StreamFinal;

import java.util.Arrays;

class StringVowel { //start with vowel
	public static void main (String[] args) {
		String s = "I am a good boy and it is an example in java";
//		Arrays.stream (s.split (" ")).distinct ().map (String::toLowerCase).map (String::toCharArray).filter (i->i[0]=='a'||i[0]=='e'||i[0]=='i'||i[0]=='o'||i[0]=='u').map (String::new).forEach (i-> System.out.print (i+" "));
		Arrays.stream (s.split (" "))
				.map (String::toLowerCase)
				.distinct ()
				.filter (i -> "aeiou".indexOf (i.charAt (0)) != -1)
				.forEach (i -> System.out.print (i + " "));
		//s.indexOf('a')==s.indexOf(i.charAt(0))
	}
}

