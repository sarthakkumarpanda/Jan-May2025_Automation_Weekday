package com.automation.Day16_Mar_25th_2025_ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic1_Chrome_Options {
	
	//ChromeOptions is actually a pre-defined class in selenium library
	
	public WebDriver driver;
	
	//Create the Object of ChromeOptions class
	
	@Test
	public void launchApplication() {
		
		//Step 1: Create the Object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		//Using the reference call the unimplemented methods of this Class
		
		//We will control the speed of execution - Make it faster, Make it in normal speed
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//Maximize the browser
		options.addArguments("--start-maximized");
		//incognito mode 
		options.addArguments("--incognito");
		//to remote the 'Chrome is being conrtrolled by Automated Software' bar on top of the browser
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options); //this will open a blank chrome browser
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

}
