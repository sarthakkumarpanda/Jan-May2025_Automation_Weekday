package com.automation.Day13_Mar_12th_2025_TestNG_Introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic2_TestNG_Annotations {
	
	/*
	
	@BeforeSuite - this annotation will execute first
	@BeforeTest - 2nd 
	@BeforeClass - 3rd
	@BeforeMethod -
	@Test - this is your testcase and this annotation is your execution engine.
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite
	
	*/
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("No 1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("No 2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("No 3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("No 4");
	}
	

	
	@Test
	public void testCase1() {
		System.out.println("This is my first Test Case");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is my Second Test Case");
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("No 5");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("No 6");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("No 7");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("No 8");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
