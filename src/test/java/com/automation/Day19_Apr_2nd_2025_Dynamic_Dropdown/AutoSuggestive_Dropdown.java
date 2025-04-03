package com.automation.Day19_Apr_2nd_2025_Dynamic_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestive_Dropdown {

	public WebDriver driver;

	@Test
	public void bootstrapdropdown() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.us/");
		Thread.sleep(2000);
		driver.findElement(By.id("FromSector_show")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'a_FromSector_show']")).sendKeys("New");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id = 'spnNewark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'a_Editbox13_show']")).sendKeys("Las");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(), 'North Las Vegas Airport')]")).click();
	}
}
