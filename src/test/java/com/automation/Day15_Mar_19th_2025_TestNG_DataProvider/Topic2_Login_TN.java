package com.automation.Day15_Mar_19th_2025_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic2_Login_TN {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=1, dataProvider = "getData")
	public void verifyLoginWithValidCredentials(String email, String password) throws Exception {
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] loginData ={ {"seleniumpanda@gmail.com", "Selenium@123"},
				                {"seleniumpanda1@gmail.com", "Selenium@123"},
				                {"seleniumpanda2@gmail.com", "Selenium@123"},
				                {"seleniumpanda3@gmail.com", "Selenium@123"},
				                {"seleniumpanda4@gmail.com", "Selenium@123"},
				                {"seleniumpanda5@gmail.com", "Selenium@123"},
				                {"seleniumpanda6@gmail.com", "Selenium@123"} };
				               
	       return loginData;
	}
	
	
	@AfterMethod
	public void tearDown() {
	    driver.quit();	
	}

}
