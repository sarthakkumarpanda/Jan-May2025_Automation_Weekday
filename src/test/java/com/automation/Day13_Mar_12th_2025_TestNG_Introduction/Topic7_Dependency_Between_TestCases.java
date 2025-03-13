package com.automation.Day13_Mar_12th_2025_TestNG_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic7_Dependency_Between_TestCases {

	public WebDriver driver;

	@BeforeMethod
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Edit your account information")).isDisplayed();
	}

	@Test(priority = 2, dependsOnMethods = "verifyLoginWithValidCredentials")
	public void viewLogoutLinkIsPresent() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).isDisplayed();
		Assert.fail(); //this is forcefully failing this test case
	}

	@Test(priority=3, dependsOnMethods = {"verifyLoginWithValidCredentials", "viewLogoutLinkIsPresent"})
	public void clickOnLogoutLinkTest() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		if (driver.findElement(By.linkText("Logout")).isDisplayed()) {
			driver.findElement(By.linkText("Logout")).click();
		} else {
			System.out.println("Logout link is not displayed");
		}

	}

	@AfterMethod
	public void teardown() {
        driver.quit();
	}
}
