package com.java;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		PerfectNumberImpl perfectnumber = new PerfectNumberImpl();
		perfectnumber.verifyPerfectNumber(value);
		System.out.println("End of problem2");
	}

}
