package com.automation.Day15_Mar_19th_2025_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class External_TestCases {
	
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test(priority=1, dataProvider = "getLoginTestData", dataProviderClass = External_DataSource.class)
	public void loginTest(String email, String password) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	
	
	@Test(priority=2, dataProvider = "getRegisterTestData", dataProviderClass = External_DataSource.class)
	public void registerTest(String firstname, String lastname, String telephone, String password, String confirmpassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda168123@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
	    softassert.assertAll();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
