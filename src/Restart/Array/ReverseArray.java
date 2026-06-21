package Restart.Array;


class ReverseArray {
	public static void main (String[] args) {
		int[] arr = {3, 4, 2, 0, 5, 89, 89, 46, 83};
		for (int a : getRevArray (arr)) {
			System.out.print (a + " ");
		}
	}
	static int[] getRevArray (int[] arr) {
		int i =0;
		int j =arr.length-1;
		while (i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;

	}
}
