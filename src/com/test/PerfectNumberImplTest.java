package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.java.PerfectNumberImpl;

import junit.framework.TestCase;

public class PerfectNumberImplTest extends TestCase {

	String testPerfectNumber = "perfect number";
	PerfectNumberImpl perfectnumImpl = new PerfectNumberImpl();

	@Test
	public void testVerifyPerfectNumber() {
		int number = 6;
		boolean result = perfectnumImpl.verifyPerfectNumber(number);
		Assert.assertTrue(result);

	}
	
	@Test
	public void testVerifyNotPerfectNumber() {
		int number = 10;
		boolean result = perfectnumImpl.verifyPerfectNumber(number);
		Assert.assertFalse(result);

	}

}
