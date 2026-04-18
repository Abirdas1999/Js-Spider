package com.PractiseAll.Set1;

import java.util.Arrays;

class InsertionSort {
	public static void main(String[] args) {
	    int [] a = {2,3,4,7,0,1};
		InSort(a);
		System.out.println (Arrays.toString (a));
	}
	static void InSort(int [] a){
		for (int i = 0; i <a.length ; i++) {
			int index = i;
			for (int j = i+1; j <a.length ; j++) {
				if (a[j]<a[index]){
					index = j;
				}
			}
			if (index!=i){
				int temp = a[index];
				a[index] =a[i];
				a[i] = temp;
			}
		}
	}

}
