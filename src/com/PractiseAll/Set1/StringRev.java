package com.PractiseAll.Set1;

class StringRev {
	public static void main(String[] args) {
	    String s = "Java Is Easy";
		getString(s);
	}
	static void getString(String s){
		String [] arr = s.split (" ");
		String s2 ="";
		for (int i = 0; i < arr.length; i++) {
			s2+=getRev(arr[i])+" ";
		}
		System.out.println (s2);
	}
	static String getRev(String s){
		char [] a = s.toCharArray ();
		char temp = a[0];
		a[0] = a[a.length-1];
		a[a.length-1]  =temp;
		return new String (a);
	}

}
