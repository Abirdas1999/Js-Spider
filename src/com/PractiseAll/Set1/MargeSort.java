package com.PractiseAll.Set1;

import java.util.Arrays;

class MargeSort {
	public static void main(String[] args) {
		int [] a = {2,5,1,8,9,3,0};
		MSort(a);
		System.out.println (Arrays.toString (a));
	}
	static void MSort(int [] a){
		if (a.length == 1)return;
		int [] left = new int [a.length/2];
		int [] right = new int [a.length - left.length];

		int i = 0;
		while (i<left.length){
			left[i] = a[i];
			i++;
		}

		int j = 0;
		while (j<right.length){
			right[j] = a[i];
			i++;
			j++;
		}
		MSort (left);
		MSort (right);
		MargeS (left,right,a);
	}
	static void MargeS(int [] a,int [] b,int [] c){
		int i = 0;
		int j = 0;
		int k = 0;
		while (i<a.length && j<b.length){
			if (a[i]<b[j]){
				c[k++] = a[i++];
			}else {
				c[k++] = b[j++];
			}
		}
		while (i<a.length)c[k++] = a[i++];
		while (j<b.length)c[k++] = b[j++];

	}


}
