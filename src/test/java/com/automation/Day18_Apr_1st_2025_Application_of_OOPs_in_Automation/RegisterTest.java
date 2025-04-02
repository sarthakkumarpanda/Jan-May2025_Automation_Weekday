package com.automation.Day18_Apr_1st_2025_Application_of_OOPs_in_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.Day17_Mar_26th_2025_DateTimeStamp.TimeStamp;

public class RegisterTest extends TestBase{
	
	public RegisterTest() throws Exception {
		super();
	}




	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("Chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority=1)
	public void verifyRegisterWithMandatoryDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(TimeStamp.dateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
	    softassert.assertAll();
	}
	
	@Test(priority=2)
	public void verifyRegisterWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(TimeStamp.dateTimeStamp());
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
	public void verifyRegisterWithExistingEmail() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: E-Mail Address is already registered!";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();
	}
	
	@Test(priority=4)
	public void verifyRegisterWithIncorrectConfirmPasswored() {
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys(TimeStamp.dateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123456");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Password confirmation does not match password!']")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority=5)
	public void verifyRegisterWithNoDetails() {
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
