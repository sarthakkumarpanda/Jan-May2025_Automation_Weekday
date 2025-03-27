package com.automation.Day16_Mar_25th_2025_HomeAssignment;

import org.testng.annotations.DataProvider;

public class Data_Holder {
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] getRegisterTestData = { {"Selenium", "Panda", "9876543210", "Selenium@123", "Selenium@123"},
				                           {"Selenium", "Panda", "9876543210", "Selenium@123", "Selenium@123"}};
		
		return getRegisterTestData;
		}
	}


