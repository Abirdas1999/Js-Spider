package com.Java_Core.ZZpractise;

import java.util.Arrays;

interface Dupli{
	void getDupliString(String s);
}
class RemoveDupli {
	public static void main(String[] args) {
	    String s ="baannana";
		Dupli d = str ->{
			Arrays.stream (str.split ("")).distinct ().forEach (System.out::print);
		};
		d.getDupliString (s);
	}


}
