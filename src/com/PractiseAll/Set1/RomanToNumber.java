package com.PractiseAll.Set1;

import java.util.LinkedHashMap;
import java.util.Map;

class RomanToNumber {
	 public static void main(String[] args) {
		 String s = "MCMXCIV";

		 Map<Character,Integer> map = new LinkedHashMap<> ();
		 map.put('I',1);
		 map.put('V',5);
		 map.put('X',10);
		 map.put('L',50);
		 map.put('C',100);
		 map.put('D',500);
		 map.put('M',1000);

		 int sum = 0;
		 //M C M X C I V
		 //0 1 2 3 4 5 6
		 for(int i=0;i<s.length();i++){
			 int curr = map.get(s.charAt(i));
			 if(i < s.length()-1 && curr < map.get(s.charAt(i+1))){
				 sum -= curr;
			 }else{
				 sum += curr;
			 }
		 }
		 System.out.println(sum);
	 }
}
