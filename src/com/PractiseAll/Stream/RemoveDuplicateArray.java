package com.PractiseAll.Stream;

class RemoveDuplicateArray {
	public static void main(String[] args) {
	    int [] a = {3,2,56,3,2,1,4,1};
		int[] seen = new int[100]; // assuming values 0–99

		for (int i = 0; i < a.length; i++) {
			if (seen[a[i]] == 0) {
				System.out.print(a[i] + " ");
				seen[a[i]] = a[i];
			}
		}
	}

}
