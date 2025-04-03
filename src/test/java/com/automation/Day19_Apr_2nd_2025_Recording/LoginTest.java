package com.automation.Day19_Apr_2nd_2025_Recording;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{
	
	public LoginTest() throws Exception {
		super();
	}

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	
	@BeforeMethod
	public void setup() {
	    driver = initializeBrowserAndOpenApplication("Chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() throws Exception {
		ScreenRecorderUtil.startRecord("verifyLoginWithValidCredentials");
		
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		
		ScreenRecorderUtil.stopRecord();
		
	}
	
	@Test(priority=2)
	public void verifyLoginWithInvalidEmailValidPassword() throws Exception {
		ScreenRecorderUtil.startRecord("verifyLoginWithInvalidEmailValidPassword");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertEquals(actualWarningMessage, expectedWarningMessage);
		softassert.assertAll();
		ScreenRecorderUtil.stopRecord();
	}
	
	@Test(priority=3)
	public void verifyLoginWithValidEmailInvalidPassword() throws Exception {
		ScreenRecorderUtil.startRecord("verifyLoginWithValidEmailInvalidPassword");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertEquals(actualWarningMessage, expectedWarningMessage);
		softassert.assertAll();
		ScreenRecorderUtil.stopRecord();
	}
	
	@Test(priority=4)
	public void verifyLoginWithValidInvalidCredentials() throws Exception {
		ScreenRecorderUtil.startRecord("verifyLoginWithValidInvalidCredentials");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertEquals(actualWarningMessage, expectedWarningMessage);
		softassert.assertAll();
		ScreenRecorderUtil.stopRecord();
	}
	
	@Test(priority=4)
	public void verifyLoginWithValidNoCredentials() throws Exception {
		ScreenRecorderUtil.startRecord("verifyLoginWithValidNoCredentials");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		softassert.assertEquals(actualWarningMessage, expectedWarningMessage);
		softassert.assertAll();
		ScreenRecorderUtil.stopRecord();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
