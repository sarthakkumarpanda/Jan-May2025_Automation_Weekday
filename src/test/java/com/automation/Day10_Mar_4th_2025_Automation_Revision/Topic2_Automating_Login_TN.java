package com.automation.Day10_Mar_4th_2025_Automation_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic2_Automating_Login_TN {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://tutorialsninja.com/demo");
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Continue")).click();
	

	}

}
