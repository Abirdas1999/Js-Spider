package Restart.Array;

import java.util.Scanner;

class Missing {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 13};
		getMissing (arr);
	}
	static void getMissing(int [] arr){
		//sorting
		for (int i = 0; i <arr.length ; i++) {
			for (int j = i+1; j <arr.length-i ; j++) {
				if (arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int a :arr) System.out.print (a+" ");
		System.out.println ();
		//miising
		for (int i = arr[0]; i <=arr[arr.length-1] ; i++) {

			boolean flag = true;
			for (int a : arr){
				if (i==a)flag = false;
			}
			if (flag) System.out.print (i+" ");
		}

	}
}
