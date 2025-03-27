package com.automation.Day16_Mar_25th_2025_ToolTip_Latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipAutomation {
	
	public WebDriver driver;
	
	@Test
	public void rediffHomePage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement loginLink = driver.findElement(By.className("signin"));
		
		String tooltipText = loginLink.getDomAttribute("title");
		System.out.println("The text of the web element Loginlink is : " + tooltipText);
	}

}
