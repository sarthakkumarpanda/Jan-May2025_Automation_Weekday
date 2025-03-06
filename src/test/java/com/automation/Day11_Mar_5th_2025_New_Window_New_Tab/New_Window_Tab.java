package com.automation.Day11_Mar_5th_2025_New_Window_New_Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Window_Tab {
	
	//Open a website in one browser window
	//Open another website in another browser window
	//Open another website in the same browser window but in a different tab
	//continue opening websites in different tabs

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://bestbuy.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://walmart.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		

	}

}
