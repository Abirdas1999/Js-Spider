package com.Java_Core.strings.Questions;

import java.util.Arrays;


class StringRotate {
	public static void main(String[] args) {
	    String s = "abir";
		int[]arr = {123214};
		System.out.println (isMirrorSequence(arr));
		getRotate(s);
	}
	static void getRotate(String s){
		char [] ch = s.toCharArray ();
		for (int i = 0; i <ch.length ; i++) {
			char d = ch[ch.length-1];
			for (int j = ch.length-1; j >=i+1; j--) {
				ch[j] = ch[j-1];
			}
			ch[i] = d;
			System.out.println (Arrays.toString (ch));

		}
	}
	static boolean isMirrorSequence(int[] arr) {
		int [] temp = arr;
		for(int i = 0;i<arr.length;i++){
			int d = arr[arr.length-1];
			for(int j = arr.length-1;j>=i+1;i--){
				arr[j] = arr[j-1];
			}
			arr[i] = d;
		}
		return temp==arr;

	}

}
