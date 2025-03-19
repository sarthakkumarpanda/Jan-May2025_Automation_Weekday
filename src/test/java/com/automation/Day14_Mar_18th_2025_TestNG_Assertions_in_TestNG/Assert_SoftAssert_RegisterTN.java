package com.automation.Day14_Mar_18th_2025_TestNG_Assertions_in_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssert_RegisterTN {
	
	//Rule 1: Create the object of SoftAssert class
	//Rule 2: Last line within the method should be softassert reference calling the method assertAll();
	

	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void registerWithMandatoryDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda168@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
	    softassert.assertAll();
	}
	
	
	@Test(priority=2)
	public void registerWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda166@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
	    softassert.assertAll();
	}
	
	@Test(priority=3)
	public void registerWithNoDetails() {
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		
		Assert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage));
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'First Name must be between 1 and 32 characters!']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Last Name must be between 1 and 32 characters!']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'E-Mail Address does not appear to be valid!']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Telephone must be between 3 and 32 characters!']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Password must be between 4 and 20 characters!']")).isDisplayed());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
