package com.java;

public class PerfectNumberImpl {
	
	
	public boolean verifyPerfectNumber(int number) {
		boolean flag = false;
		if(number > 0 && number < 10000)
		{
		
		int tempVar = 0;
		for (int counter = 1; counter <= number / 2; counter++) {
			if (number % counter == 0) {
				tempVar = tempVar + counter;
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
