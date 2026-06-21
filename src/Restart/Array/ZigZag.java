package Restart.Array;

class ZigZag {
	public static void main (String[] args) {
		int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
		int[] arr2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
		zigzag (arr,arr2);
	}
	static void zigzag(int [] arr,int [] arr2){
		for (int i = 0; i <arr.length ; i++) {
			System.out.print (arr[i]+" ");
			System.out.print (arr2[i]+" ");
		}
	}
}
