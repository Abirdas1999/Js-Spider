package com.PractiseAll.Set1;

class Spiral {
	public static void main (String[] args) {
		int[][] a = getSpiral (5);
		for (int i = 0; i < a.length; i++) {
			for (int v : a[i]) {
				System.out.print (v + "\t");
			}
			System.out.println ();
		}
	}

	static int[][] getSpiral (int size) {
		int[][] a = new int[size][size];
		int r = 0;
		int c = -1;
		char dir = 'r';
		for (int i = 1; i <= size * size; i++) {
			switch (dir) {
				case 'r':
					a[r][++c] = i;
					if (c == size - r - 1) dir = 'd';
					break;
				case 'd':
					a[++r][c] = i;
					if (r == c) dir = 'l';
					break;
				case 'l':
					a[r][--c] = i;
					if (c == size - r - 1) dir = 'u';
					break;
				case 'u':
					a[--r][c] = i;
					if (r == c + 1) dir = 'r';
					break;
			}
		}
		return a;
	}

}
