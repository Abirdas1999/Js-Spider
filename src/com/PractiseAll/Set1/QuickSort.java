package com.PractiseAll.Set1;

import java.util.Arrays;

class QuickSort {
	public static void main(String[] args) {
	    int [] a = {2,5,1,8,9,3,0};
		QSort(a,0,a.length-1);
		System.out.println (Arrays.toString (a));
	}
	static void QSort(int [] a,int st,int ed){
		if (st>=ed)return;
		int i = st;
		int j = ed;
		int pivot = a[(st+ed)/2];
		while (i<=j){
			while (a[i]<pivot)i++;
			while (a[j]>pivot)j--;
			if (i<=j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
 			}
			QSort (a,st,j);
			QSort (a,i,ed);
		}
	}


}
