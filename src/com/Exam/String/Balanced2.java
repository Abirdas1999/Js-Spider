package com.Exam.String;

public class Balanced2 {

	public static void main(String[] args) {

		String s = "{[}";
		char[] arr = s.toCharArray();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			// check closing brackets
			if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
				boolean found = false;
				// search backward
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] == ')' && arr[j] == '(') {
						arr[j] = '0';
						found = true;
						break;
					}
					if (arr[i] == '}' && arr[j] == '{') {
						arr[j] = '0';
						found = true;
						break;
					}

					if (arr[i] == ']' && arr[j] == '[') {
						arr[j] = '0';
						found = true;
						break;
					}
				}


				if (!found) {
					flag = false;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				flag = false;
				break;
			}

		}

		if (flag) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}