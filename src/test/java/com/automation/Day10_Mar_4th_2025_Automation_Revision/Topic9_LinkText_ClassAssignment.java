package com.automation.Day10_Mar_4th_2025_Automation_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic9_LinkText_ClassAssignment {

	public static void main(String[] args) {
		
		rediffmailLink();
		moneyLink();
		enterpriseEmailLink();
		businessEmailLink();
		rediffGurusLink();
		createAccountLink();
	}
	
	public static void rediffmailLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.quit();
	}
	
	public static void moneyLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Money")).click();
		driver.quit();
	}
	
	public static void enterpriseEmailLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Enterprise Email")).click();
		driver.quit();
	}
	
	public static void businessEmailLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Business Email")).click();
		driver.quit();
	}
	
	public static void rediffGurusLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("rediffGURUS")).click();
		driver.quit();
	}
	
	public static void createAccountLink() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Create Account")).click();
		driver.quit();
	}

}
