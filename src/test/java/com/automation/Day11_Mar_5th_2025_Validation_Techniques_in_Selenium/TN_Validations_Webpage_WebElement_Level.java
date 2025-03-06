package com.automation.Day11_Mar_5th_2025_Validation_Techniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TN_Validations_Webpage_WebElement_Level {

	public static void main(String[] args) {
		// Validate that the Landing Page is correct
		//Validate that the Login Page is correct
		//Validate that the Register Page is correct
		landingPage();
		loginPage();
		registerPage();

	}
	
	public static void landingPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		WebElement qafoxLogo = driver.findElement(By.linkText("Qafox.com"));
		if(qafoxLogo.isDisplayed()) {
			System.out.println("Landing Page is correct");
		}else {
			System.out.println("Landing Page is incorrect");
		}
		driver.quit();
	}
	
	public static void loginPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passowrdTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		if(emailTextBox.isDisplayed() && passowrdTextBox.isDisplayed() && loginButton.isEnabled()) {
			emailTextBox.sendKeys("seleniumpanda@gmail.com");
			passowrdTextBox.sendKeys("Selenium@123");
			loginButton.click();
			System.out.println("Login Page is correct");
		}else {
			System.out.println("Login Page is incorrect");
		}
		driver.quit();
	}
	
	public static void registerPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement firstnameTextBox = driver.findElement(By.id("input-firstname"));
		WebElement lastnameTextBox = driver.findElement(By.id("input-lastname"));
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement TelephoneTextBox = driver.findElement(By.id("input-telephone"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement passwordConfirmTextBox = driver.findElement(By.id("input-confirm"));
		WebElement privacyPolicyCheckBox = driver.findElement(By.name("agree"));
		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		if(firstnameTextBox.isDisplayed() && lastnameTextBox.isDisplayed() && emailTextBox.isDisplayed() 
				&& TelephoneTextBox.isDisplayed() && passwordTextBox.isDisplayed() && passwordConfirmTextBox.isDisplayed()
				&& privacyPolicyCheckBox.isEnabled() && continueButton.isEnabled()) {
			firstnameTextBox.sendKeys("Hello");
			lastnameTextBox.sendKeys("World");
			emailTextBox.sendKeys("seleniumpanda132@gmail.com");
			TelephoneTextBox.sendKeys("9876543210");
			passwordTextBox.sendKeys("Selenium@123");
			passwordConfirmTextBox.sendKeys("Selenium@123");
			privacyPolicyCheckBox.click();
			continueButton.click();
			System.out.println("Register Page is correct");
		}else {
			System.out.println("Register Page is incorrect");
		}
		driver.quit();
	}
	

}
