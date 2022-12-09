package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.JUnit_Prime;

public class Prime{
	@Test
	public void tesing() {
		assertEquals(true,JUnit_Prime.checkPrime(5));
		assertEquals(true,JUnit_Prime.checkPrime(114));
	}
}

