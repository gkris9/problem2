package com.test;

import org.junit.Test;

import com.java.PerfectNumberImpl;

import junit.framework.TestCase;

public class PerfectNumberImplTest extends TestCase {

	String testPerfectNumber = "perfect number";
	PerfectNumberImpl perfectnumImpl = new PerfectNumberImpl();

	@Test
	public void testVerifyPerfectNumber() {
		int number = 28;
		String result = perfectnumImpl.verifyPerfectNumber(number);
		assertEquals(testPerfectNumber, result);

	}

}
