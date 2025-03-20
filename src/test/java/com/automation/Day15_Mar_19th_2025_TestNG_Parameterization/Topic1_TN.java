package com.automation.Day15_Mar_19th_2025_TestNG_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic1_TN {
	
	//Parameterization - means using multiple inputs over the same logic to determine multiple outputs.
	
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test(priority = 1)
	@Parameters({"url", "email", "password"})
	public void loginTest(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); //url can act as a parameter
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email); //email
		driver.findElement(By.id("input-password")).sendKeys(password); //password
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 2)
	@Parameters({"url", "firstname", "lastname", "registeredEmail", "telephone", "password"})
	public void resgisterTest(String url, String firstname, String lastname, String registeredEmail, String telephone, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url); //url
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname); //firstname
		driver.findElement(By.id("input-lastname")).sendKeys(lastname); //lastname
		driver.findElement(By.id("input-email")).sendKeys(registeredEmail); //registered email
		driver.findElement(By.id("input-telephone")).sendKeys(telephone); //telephone
		driver.findElement(By.id("input-password")).sendKeys(password); //password
		driver.findElement(By.id("input-confirm")).sendKeys(password); //confirmpassword
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
