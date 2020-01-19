package com.quinta.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condition = true;
		assertEquals(true, condition);
		assertTrue(condition);
		assertFalse(!condition);
	}

}
