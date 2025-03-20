package com.automation.Day15_Mar_19th_2025_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic1_Rules {
	
	//Rules of DataProvider
	
	//1. It will return a 2-D Object array
	//2. Pass the data in rows and cols of this 2-D array
	//3. Connect the @Test case with the @DataProvider in 2 different ways
	      //1st way - By providing a TestNG annotation known as dataProvider = nameOftheMethod inside the @DataProvider
	      //2nd way - By passing a TestNG annotation known as name = nameofTheMethod inside the @DataProvider
	//4. Need to parameterize the method in @Test with all cols declared in the 2-D array
	
	
	
	@Test(dataProvider = "getData")
	public void checkResult(String username, String password, int telephone, String browserName) {
	System.out.println(username + "-----" + password + "---------" + telephone + "-----------" + browserName);	
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		//Step 1 - Create a 2-D Object array
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 987654321;
		data[0][3] = "Chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 987654321;
		data[1][3] = "Firefox";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 987654321;
		data[2][3] = "Edge";
		
		return data;
		
	}

}
