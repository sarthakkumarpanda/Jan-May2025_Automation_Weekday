package com.automation.Day14_Mar_18th_2025_TestNG_Assertions_in_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic2_Assert_or_Hard_assert {
	//Assert is a predefined Class
	//Some methods in Assert class are very popular
	//assertTrue(), assertEquals()
	
	@Test
	public void checkingHardAssertInMyLogic() {
		int i = 10;
		int j = 20;
		System.out.println(i + j);//30
		Assert.assertTrue(i != j); //true
		System.out.println(2*(i+j)); //60
		Assert.assertEquals(i, j);//false. At this line assertion fails, so Assert will not let you proceed with further lines of code inside this method
		System.out.println(i + j + i); //40
		System.out.println(20 + 30);
		
	}
	
	@Test
	public void somemethod() {
		System.out.println("This is the other method");
	}

}
