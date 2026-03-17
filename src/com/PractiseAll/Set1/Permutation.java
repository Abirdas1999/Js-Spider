package com.PractiseAll.Set1;

class Permutation {
	public static void main(String[] args) {
	    String s = "abc";
		getPermutation(s,0,s.length ()-1);
	}
	static void getPermutation(String s,int st,int ed){
		if (st==ed){
			System.out.println (s);
			return;
		}
		for (int i = st; i <=ed ; i++) {
			String s2 = getSwap (s,st,i);
			getPermutation (s2,st+1,ed);
		}
	}
	static String getSwap(String s,int i,int j){
		char [] a = s.toCharArray ();
		char tmep = a[i];
		a[i] = a[j];
		a[j] = tmep;
		return new String (a);
	}
}
