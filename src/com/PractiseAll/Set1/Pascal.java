package com.PractiseAll.Set1;

class Pascal {
	public static void main(String[] args) {
		int [] [] a = getPascal(7);
		for (int i = 0; i <a.length ; i++){
			for (int j = 0; j <a.length-i ; j++) {
				System.out.print (" ");
			}
			for (int v : a[i]){
				System.out.print (" "+v);
			}
			System.out.println ();
		}
	}
	static int [] [] getPascal(int size){
		int [] [] a = new int [size][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int  [i+1];
			for (int j = 0; j <a[i].length ; j++) {
				if (i==j || j == 0){
					a[i][j] = 1;
				}else {
					a[i][j] = a[i-1][j] + a[i-1][j-1];
				}
			}



		}
		return a;
	}

}
