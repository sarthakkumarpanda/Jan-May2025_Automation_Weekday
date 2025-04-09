package com.automation.Day20_Apr_8th_2025_Calendar;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	
	@Test
	public void datePicker() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//driver.findElement(By.id("datepicker")).sendKeys("12/25/2026"); //this might work in this webpage on this webelement but not in all cases
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		//Which month and year are we targetting - December 2027
		//Original String looks like = "December 2027"
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("December") && year.equals("2027"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '25']")).click();
	
	}

}
