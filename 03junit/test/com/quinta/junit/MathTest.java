package com.quinta.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
	
	Math myMath = new Math();
	
	@Before
	public void beforeEach() {
		System.out.print("Before each");
	}
	
	@After
	public void afterEach() {
		System.out.print("After each");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.print("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.print("After class");
	}
	
	@Test
	public void test_with3numbers() {
		System.out.print("Test 1");
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		
		int res = myMath.sum(new int[] {number1, number2, number3});
		
		assertEquals(6, res);
	}
	
	@Test
	public void test_with1number() {
		System.out.print("Test 2");
		int number1 = 1;
		int res = myMath.sum(new int[] {number1});
		
		assertEquals(number1, res);
	}

}
