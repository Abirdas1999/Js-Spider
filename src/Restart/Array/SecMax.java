package Restart.Array;

class SecMax {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 89, 89, 46, 83, 0};
		getSecMax (arr);
	}

	static void getSecMax (int[] arr) {
		int max = 0;
		int secMax = 0;
		int maxSecIndex = 0;
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] > max) {
				secMax = max;
				maxSecIndex = a;
				max = arr[a];
			} else if (secMax < arr[a] && arr[a] < max ) {
				secMax = arr[a];
				maxSecIndex = a;
			}
		}
		System.out.println (secMax + " ---> index[" + maxSecIndex + "]");
	}
}
