package Restart.Array;

class Duplicate {
	public static void main (String[] args) {
		int[] arr = {0, 2, -32, 3, 4, 2, 0, 5, 89, 89, 46, 83, 0};
		removeDupli (arr);
	}

	static void removeDupli (int[] arr) {
		int[] a = new int[arr.length];
		a[0] = arr[0];
		int k = 1;
		for (int i = 1; i < arr.length; i++) {
			boolean flag = true;
			int key = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[j] == key) {
					flag = false;
					break;
				}

			}
			if (flag) {
				a[k++] = key;
			}
		}
		System.out.print ("[ ");
		for (int i = 0; i <k ; i++) {
			System.out.print (a[i]+" ");
		}
		System.out.print ("]");
	}

}
