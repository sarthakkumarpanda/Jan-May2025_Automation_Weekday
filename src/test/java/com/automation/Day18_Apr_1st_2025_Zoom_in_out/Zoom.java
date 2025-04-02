package com.automation.Day18_Apr_1st_2025_Zoom_in_out;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Zoom {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(priority=1)
	public void zoominout() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '300%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '30%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%' ;");
	}

	@Test(priority=2)
	public void zoomUsingChromeOptions() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--force-device-scale-factor=0.75"); // 125% zoom
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		
	}
}
