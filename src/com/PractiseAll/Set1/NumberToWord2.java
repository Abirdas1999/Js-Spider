package com.PractiseAll.Set1;

class NumberToWord2 {
	public static void main(String[] args) {
	    int num = 921099218;
		getNumWord((num/10000000),"Core");
		getNumWord((num/100000)%100,"Lakhs");
		getNumWord((num/1000)%100,"Thousand");
		getNumWord((num/100)%10,"Hundred");
		getNumWord((num%100),"");
	}
	static void getNumWord(int num ,String s){
		String [] one = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String [] two = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		if (num<=19){
			System.out.print (one[num]+" ");
		}else {
			System.out.print (two[num/10]+" "+one[num%10]+" ");
		}

		if (num!=0){
			System.out.print (s+" ");
		}

	}


}
