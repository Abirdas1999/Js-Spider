package Restart.Array;

class Maximum {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 89, 89, 46, 83, 0};
		getMax (arr);
	}

	static void getMax (int[] arr) {
		int max = 0;
		int maxIndex = 0;
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] > max) {
				max = arr[a];
				maxIndex = a;
			}
		}
		System.out.println (max + " ---> index[" + maxIndex + "]");
	}

}
