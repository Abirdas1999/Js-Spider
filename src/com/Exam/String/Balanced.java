package com.Exam.String;

import java.util.List;
import java.util.Stack;

public class Balanced {
	public static void main(String[] args) {
	    String s = "]()";
		char [] arr = s.toCharArray ();
		Stack<Character> l = new Stack<> ();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]=='{'||arr[i]=='('||arr[i]=='['){
				l.push(arr[i]);
			}else {
				if (l.isEmpty ()){
					flag = false;
					break;
				}
				char temp = l.pop ();
				if ((arr[i]=='}'&& temp!='{') || (arr[i]==']'&& temp!='[' )||(arr[i]==')'&& temp!='(')){
					flag = false;
					break;
				}
			}
			
		}
		if (flag && l.isEmpty ()){
			System.out.println ("Balanced");
		}else {
			System.out.println ("Not Balanced");

		}
	}

}
