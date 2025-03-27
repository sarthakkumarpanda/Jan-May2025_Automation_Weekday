package com.automation.Day16_Mar_25th_2025_Alerts_PopUps;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Handling_Alert {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void rediffAlert() throws Exception {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signin-btn")).click();
		
		//Alert is a pre-defined interface in Selenium Library
		
		Alert alert = driver.switchTo().alert();
		String textMessage = alert.getText();
		System.out.println("The text inside the alert is : " + textMessage);
		alert.accept();
		//alert.dismiss();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		
	}

}
