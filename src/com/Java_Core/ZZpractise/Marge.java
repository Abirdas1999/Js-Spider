package com.Java_Core.ZZpractise;

import java.util.Arrays;

class Marge {
	public static void main(String[] args) {
	    int [] a = {2,3,1,5,4,6,0};
		System.out.println (Arrays.toString (a));
		MargeSort(a);
		System.out.println (Arrays.toString (a));
	}
	static void MargeSort(int [] a){
		if (a.length == 1)return;
		int [] left = new int [a.length/2];
		int [] right = new int [a.length-left.length];

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
		MargeSort (left);
		MargeSort (right);
		marge (a,left,right);
	}
    static void marge(int [] a,int [] b, int[] c){
		int i = 0, j = 0, k = 0;
		while (i<b.length && j<c.length){
			if (b[i]<c[j]){
				a[k++] = b[i++];
			}else {
				a[k++] = c[j++];
			}
		}
	    while (i<b.length) a[k++] = b[i++];
		while (j<c.length) a[k++] = c[j++];

    }

}
