package com.automation.Day18_Apr_1st_2025_Brave_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Brave_Browser {
	
	//Step 1: Download and install the Brave browser
	//Step 2: Go to the path of brave.exe - C:\Program Files\BraveSoftware\Brave-Browser\Application\brave.exe
	//Step 3: Use ChromeOptions class
	
	public WebDriver driver;
	public ChromeOptions options;
	
	
	@Test
	public void setupInBraveBrowser() {
		options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		
	}

}
