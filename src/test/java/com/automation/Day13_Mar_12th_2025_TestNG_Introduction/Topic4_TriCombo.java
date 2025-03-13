package com.automation.Day13_Mar_12th_2025_TestNG_Introduction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic4_TriCombo {

	//@BeforeMethod and @AfterMethod will execute before and after each test case @Test.
	//If there are 100 Test Cases, then @Before will execute 100 times before each TC and @After will execute after each TC
	
	
	@BeforeMethod
	public void begin() {
		System.out.println("This will execute before each test case");
	}
	
	@Test
	public void testCase1() {
		System.out.println("TC1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("TC2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("TC3");
	}
	
	@Test
	public void testCase4() {
		System.out.println("TC4");
	}
	
	@Test
	public void testCase5() {
		System.out.println("TC5");
	}
	
	@AfterMethod
	public void closingTime() {
		System.out.println("This will execute after each test case");
	}
}
