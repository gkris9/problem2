package com.java;

public class PerfectNumberImpl {
	
	
	public boolean verifyPerfectNumber(int number) {
		boolean flag = false;
		if(number > 0 && number < 10000)
		{
		
		int tempVar = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				tempVar += i;
				}
			}
			if (tempVar == number) {
				System.out.println("Given number is perfect Number");
				flag = true;
			} else {
				System.out.println("Given number is not a perfect Number");
				flag = false;
			}
		} else {
			System.out.println("Given value is out of range");
			flag = false;
		}

		return flag;

	}
}
