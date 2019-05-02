package com.calculatorApplication.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculatorApplicationServices.Calculator;

public class CalculatorText {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	public final void testAdd() {
		int n = 2;
		int m = 1;
		int expected = 3;
		Calculator calc = new Calculator();
		int actual = calc.add(n,m);
		assertNotEquals(expected,actual);
		assertNull(calc);
		//assertEquals(expected,actual); check slide 12 for examples
		
		
	}
	public final void testSubtract() {
		int n = 2;
		int m = 1;
		int expected = 1;
		Calculator calc = new Calculator();
		int actual = calc.add(n,m);
		assertEquals(expected,actual); 
	
	}
	
	public final void testMultiply() {
		int n = 2;
		int m = 1;
		int expected = 2;
		Calculator calc = new Calculator();
		int actual = calc.add(n,m);
		assertEquals(expected,actual); 
	
	}
	
	public final void testDivide() {
		int n = 2;
		int m = 1;
		int expected = 1;
		Calculator calc = new Calculator();
		int actual = calc.add(n,m);
		assertEquals(expected,actual); 
	
	}
	
	
	
	public final void testSubtract2() {
		//1. get the case test from business
		//requirements and establish the input values
		int number1 = 5;
		int number2 = 3;
		int expected = 2;
		
		Calculator calc = new Calculator();
		int actual = calc.subtract(number1, number2);
		assertEquals(expected, actual); 
	
	}
	
	
	
	public final void testDivide2() {
		assertEquals("hello", "hello");
		assertEquals(1d,1d,0);

	}
	
	/*
	public void testAdd() {
		fail("Not yet implemented");
	
	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}
}*/
}
