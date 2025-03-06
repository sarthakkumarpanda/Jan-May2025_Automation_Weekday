package com.automation.Day11_Mar_5th_2025_Validation_Techniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validation_WebElement_Level {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signinLink = driver.findElement(By.linkText("Sign in"));
		if(signinLink.isDisplayed() && signinLink.isEnabled()) {
			System.out.println("My code is correct");
			signinLink.click();
		}else {
			System.out.println("My code is incorrect");
		}

		 driver.quit();
	}

}
