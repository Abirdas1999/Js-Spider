package Restart.Array;

class SumPrime {
	public static void main (String[] args) {
		int[] arr = {0,2,-32,3, 4, 2, 0, 5, 89, 89, 46, 83, 0};
		getSumPrime (arr);
	}

	static void getSumPrime (int[] arr) {
		int sum = 0;
		for (int a:arr){
			if (isPrime (a,a/2))sum+=a;
		}
		System.out.println (sum);
	}

	static boolean isPrime (int a, int i) {
		if (a < 2) return false;
		if (i < 2) return true;
		if (a % i == 0) return false;
		return isPrime (a, i - 1);
	}

}
