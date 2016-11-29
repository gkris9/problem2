package com.java;

public class PerfectNumberImpl {
	public String verifyPerfectNumber(int number) {
		String message = "";
		int tempVar = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				tempVar += i;
			}
		}
		if (tempVar == number) {

			message = "perfect number";
		} else {

			message = "not a perfect number";
		}

		System.out.println(number + " is " + message);
		return message;

	}
}
