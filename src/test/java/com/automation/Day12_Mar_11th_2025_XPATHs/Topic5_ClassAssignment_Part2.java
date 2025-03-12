package com.automation.Day12_Mar_11th_2025_XPATHs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic5_ClassAssignment_Part2 {
	
	// 1st Syntax
		// htmltag[@attribute = 'valueoftheattribute']

		// 2nd Syntax
		// htmltag[@attribute1 = 'valueoftheattribute1' and @attribute2 ='valueoftheattribute2']
		// htmltag[@attribute1 = 'valueoftheattribute1' or @attribute2 ='valueoftheattribute2']

		// 3rd Syntax. Links are always given some extra privileges
		// html[text() = 'valueofthetext']

		// 4th and 5th Syntax [links as well as normal webelements]
		// html[contains(text(), 'valueofthetext')] - this is mostly used for links
		// html[contains(@attribute, 'valueoftheattribute')] - this is for all the other webelements

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda171@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		
		

	}

}
