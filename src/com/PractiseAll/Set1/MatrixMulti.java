package com.PractiseAll.Set1;

class MatrixMulti {
	public static void main(String[] args) {
		int[][] a = {
				{2,3,1},
				{3,6,4},
				{3,7,5}
		};
		int[][] b = {
				{2,3,1},
				{3,6,4},
				{3,7,5}
		};
		int [] [] c = getMatrix(a,b);
		for (int [] temp :c ){
			for (int d:temp){
				System.out.print(d+"\t");
			}
			System.out.println();
		}


	}
	static int [][] getMatrix(int [] [] a,int [] [] b){
		int size = a.length;
		int [] [] c = new int [size] [size];
		for (int i = 0; i <size ; i++) {
			for (int j = 0; j <size ; j++) {
				for (int k = 0; k <size ; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

}
