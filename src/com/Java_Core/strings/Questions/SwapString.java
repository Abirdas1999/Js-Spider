package com.Java_Core.strings.Questions;

class SwapString {
	public static void main(String[] args) {
		//without 3rd variable
		String s1 = "abir";
		String s2 = "amit";
		getSwapRes(s1,s2);
	}
	static void getSwapRes(String s1,String s2){
		System.out.println ("Before Swaping -> \n1."+s1+"\n"+"2."+s2);
		System.out.println ("-----------------------");
		s1+=s2;
		s2 = s1.substring (0,s1.length ()-s2.length ());
		s1 = s1.substring (s1.length ()-s2.length ());

		System.out.println ("After Swaping -> \n1."+s1+"\n"+"2."+s2);
	}

}
