package com.automation.Day14_Mar_18th_2025_TestNG_Annotations;

import org.testng.annotations.Test;

public class Topic1_Enabling_Disabling_TestCases { //Switch it off. Do not execute the test case
	//in interview they will ask, what is the difference between enabled = true and not writing anything
	
	@Test(priority=1, enabled = false)
	public void logic1() {
		System.out.println("I want this to execute");
	}
	
	@Test(priority=2, enabled = false)
	public void logic2() {
		System.out.println("I am thinking about it");
	}
	
	@Test(priority=3, enabled = true)
	public void logic3() {
		System.out.println("I may or may not exec this");
	}
	
	@Test(priority=4, enabled = false)
	public void logic4() {
		System.out.println("I want this to execute");
	}

}
