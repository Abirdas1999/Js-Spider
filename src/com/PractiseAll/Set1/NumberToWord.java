package com.PractiseAll.Set1;

import java.util.LinkedHashMap;
import java.util.Map;

class NumberToWord {
	public static void main(String[] args) {
	    getWord(32453);
	}
	static void getWord(int n){
		Map<Integer,String> m = new LinkedHashMap<> ();
		m.put (10000000,"Core");
		m.put (100000,"Lakhs");
		m.put(1000,"Thousand");
		m.put(100,"Hundred");
		m.put(90,"Ninety");
		m.put(80,"Eighty");
		m.put(70,"Seventy");
		m.put(60,"Sixty");
		m.put(50,"Fifty");
		m.put(40,"Forty");
		m.put(30,"Thirty");
		m.put(20,"Twenty");
		m.put(19,"Nineteen");
		m.put(18,"Eighteen");
		m.put(17,"Seventeen");
		m.put(16,"Sixteen");
		m.put(15,"Fifteen");
		m.put(14,"Fourteen");
		m.put(13,"Thirteen");
		m.put(12,"Twelve");
		m.put(11,"Eleven");
		m.put (10,"Ten");
		m.put (9,"Nine");
		m.put (8,"Eight");
		m.put (7,"Seven");
		m.put (6,"Six");
		m.put (5,"Five");
		m.put (4,"Four");
		m.put (3,"Three");
		m.put (2,"Two");
		m.put (1,"One");

		for(int x : m.keySet()){
			if(n >= x){
				int q = n / x;
				if(x >= 100){
					getWord(q);
					System.out.print(m.get(x) + " ");
				}else{
					System.out.print(m.get(x) + " ");
				}
				n = n % x;
			}

		}

	}

}
