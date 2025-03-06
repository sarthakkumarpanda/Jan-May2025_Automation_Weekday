package com.automation.Day10_Mar_4th_2025_Automation_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic6_ClassAssignment {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda191@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); //Compound class not permitted
		
		//Compund means multiple values - btn btn-primary
		
		
		
		
	}

}
