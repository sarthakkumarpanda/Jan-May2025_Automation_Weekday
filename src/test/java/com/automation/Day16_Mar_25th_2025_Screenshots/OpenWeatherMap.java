package com.automation.Day16_Mar_25th_2025_Screenshots;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class OpenWeatherMap {
	
	public WebDriver driver;
	
	@Test
	public void screenShotCode() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//Step 1: Choose the image. This image will act as the WebElement
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		//Step 2: Using this logo we can caqll a method known as getScreenshotAs()
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step 3: You need to create a folder manually where you want this file from Step 2
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\owm.png");
		
		//Step 4: Use the FileHandler Class to copy the source into the destination
		FileHandler.copy(source, destination);
	}

}
