package com.java;

public class PerfectNumberImpl {
	public boolean verifyPerfectNumber(int number) {
		boolean flag = false;
		int tempVar = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				tempVar += i;
			}
		}
		if (tempVar == number) {

			flag = true;
		} else {

			flag = false;
		}

		
		return flag;

	}
}
