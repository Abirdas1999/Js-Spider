package com.Exam.String;

class Occourence {
	public static void main(String[] args) {
	    String s = "b a n b";
		char [] arr = s.toCharArray ();

		for (int i = 0; i <arr.length ; i++) {
			int count=0;
			char key = arr[i];

			for (int j = 0; j <arr.length ; j++) {
				if (key == arr[j]){
//					// skip duplicate printing
					if (i > j) {
						count = 0;
						break;
					}
					count++;
				}
			}
			if (count > 0) {
				System.out.print(key + " -> " + count + " | ");
			}
		}
	}

}
