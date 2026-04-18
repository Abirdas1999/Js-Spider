package com.PractiseAll.Set3;

public class Demo {
	public static void main(String[] args) {
	    getReversed("java is easy".toCharArray ());
	}
	static void getReversed(char [] a){
		String s2 = "";
		int k = 0;
		for (int i = 0; i <a.length ; i++) {
			if (a[i] == ' ' && a[i-1] != ' '||a[i]==a.length){
				for (int j = i-1; j >=k ; j--) {
					s2+=a[j];
				}
				k=i;
			}
		}
		System.out.println (s2);
	}

}
