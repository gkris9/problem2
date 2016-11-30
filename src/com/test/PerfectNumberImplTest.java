package com.test;

import org.junit.Assert.*;
import org.junit.Test;

import com.java.PerfectNumberImpl;

import junit.framework.TestCase;

public class PerfectNumberImplTest extends TestCase {

	PerfectNumberImpl perfectnumImpl = new PerfectNumberImpl();

	@Test
	public void testVerifyPerfectNumber() {
		int number = 6;
		boolean result = perfectnumImpl.verifyPerfectNumber(number);
		assertTrue(result);

	}

	@Test
	public void testVerifyNotPerfectNumber() {
		int number = 10;
		boolean result = perfectnumImpl.verifyPerfectNumber(number);
		assertFalse(result);

	}

	@Test
	public void testNotInRangeValue() {
		int number = 0;
		boolean result = perfectnumImpl.verifyPerfectNumber(number);
		assertFalse(result);
	}

}
