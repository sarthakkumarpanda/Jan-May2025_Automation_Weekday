package com.automation.Day15_Mar_19th_2025_TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class External_DataSource {
	
	
	@DataProvider
	public Object[][] getLoginTestData() {
		Object[][] loginData ={ {"seleniumpanda@gmail.com", "Selenium@123"},
                                {"seleniumpanda1@gmail.com", "Selenium@123"},
                                {"seleniumpanda2@gmail.com", "Selenium@123"},
                                {"seleniumpanda3@gmail.com", "Selenium@123"},
                                {"seleniumpanda4@gmail.com", "Selenium@123"},
                                {"seleniumpanda5@gmail.com", "Selenium@123"},
                                {"seleniumpanda6@gmail.com", "Selenium@123"} };
               
        return loginData;
}
	
	
	@DataProvider
	public Object[][] getRegisterTestData() {
		
		Object[][] registerData = { {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"} };
		
		return registerData;
	}

}
