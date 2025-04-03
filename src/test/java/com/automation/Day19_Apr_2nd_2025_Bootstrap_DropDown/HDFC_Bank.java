package com.automation.Day19_Apr_2nd_2025_Bootstrap_DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HDFC_Bank {

	public WebDriver driver;

	@Test
	public void bootstrapdropdown() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hdfcbank.com");

	}
}