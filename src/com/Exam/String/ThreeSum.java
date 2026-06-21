package com.Exam.String;

 class ThreeSum {
	public static void main(String[] args) {
	    int [] arr = {2,-1,0,1,-1,-2,1};
		String s = "[";
		for (int i = 0; i <arr.length ; i++) {
			for (int j = i+1; j <arr.length ; j++) {
				for (int k = j+1; k <arr.length ; k++) {
					if ((i!=j && j!=k && i!=k) && (arr[i]+arr[j]+arr[k]==0)){
						s+="["+i+", "+j+", "+k+"]";
					}

				}
			}
		}
		s+="]";
		System.out.println (s);
	}

}
