package com.automation.Day13_Mar_12th_2025_TestNG_Introduction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic3_Important_Annotations {
	
	/*
	
	@BeforeMethod
	@Test
	@AfterMethod
	
	*/
	
	@BeforeMethod
	public void launching() {
		System.out.println("This will launch my browser");
	}
	
	@Test
	public void loginTest() {
		System.out.println("I have written validation logic for Login Test Case");
	}
	
	@Test
	public void registerTest() {
		System.out.println("This holds logic for Registration");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("I am shutting the browser down");
	}

}
