package com.Exam.String;

 class Dic {
	 public static void main(String[] args) {
	     String s = "leetcode";
		 String [] words = {"leet","java","sql","code"};
		 boolean flag = false;
		 for (int i = 0; i <words.length ; i++) {
			 for (int j = i+1; j < words.length ; j++) {
			    String temp = words[i];
				 temp+=words[j];
				 if (temp.equals (s)){
					 flag = true;
					 break;
				 }
				 temp="";
			 }
		 }
		 System.out.println (flag);
	 }

}
