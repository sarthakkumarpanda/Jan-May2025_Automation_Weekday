package com.automation.Day18_Apr_1st_2025_Application_of_OOPs_in_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchTest extends TestBase{
	
	public SearchTest() throws Exception {
		super();
	}

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	
	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("Chrome");
	}

	@Test(priority=1)
	public void verifySearchOfValidProduct() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());	
	}
	
	@Test(priority=2)
	public void verifySearchOfInvalidProduct() {
		driver.findElement(By.name("search")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'There is no product that matches the search criteria.']")).isDisplayed());
	}
	
	@Test(priority=3)
	public void verifySearchOfNoProduct() {
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'There is no product that matches the search criteria.']")).isDisplayed());	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
