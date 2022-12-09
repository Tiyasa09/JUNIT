package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.JUnit_Demo1;

public class JUnit_Test1 {
	@Test
	public void max() {
		assertEquals(8,JUnit_Demo1.max(new int[] {1,3,5,8,7}));
		assertEquals(-1,JUnit_Demo1.max(new int[] {-1,-3,-5,-8,-6}));
	}

}
