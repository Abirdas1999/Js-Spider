package com.PractiseAll.Stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Palindrome {
	public static void main(String[] args) {
		String s = "madam level test java";
		String res = Arrays.stream (s.split (" ")).filter (i->i.equals (new StringBuilder (i).reverse ().toString ())).collect (Collectors.joining (" "));
		System.out.println (res);
		Predicate<Integer> pre=(num)->{
			int temp=num;
			String ans="";
			while(num>0){
				int rem=num%10;
				ans+=rem;
				num/=10;
			}
			int rev=Integer.parseInt (ans);

			return temp==rev;
		};
		System.out.println (pre.test (123));
	}
}
