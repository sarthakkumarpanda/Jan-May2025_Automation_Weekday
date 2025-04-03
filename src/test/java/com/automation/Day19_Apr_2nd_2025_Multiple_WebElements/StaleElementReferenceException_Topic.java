package com.automation.Day19_Apr_2nd_2025_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceException_Topic {
	
	public WebDriver driver;
	
	@Test
	public void bbcHomePage() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		//Collect all the header links of BBC.com
		
		List<WebElement> headerLinks = driver.findElements(By.cssSelector("ul.sc-f116bf72-2.bXpjTY>li"));
		System.out.println("Total header links of BBC.com is :" + headerLinks.size());
		
		for(int i=0 ; i<headerLinks.size() ; i++) {
			System.out.println(headerLinks.get(i).getText()+"----"+headerLinks.get(i).getDomAttribute("href"));
			
			//you want to click on each link
			headerLinks.get(i).click();
			System.out.println("The tile of the page is : " + driver.getTitle());
			driver.get("https://bbc.com");
			Thread.sleep(2000);
			
			headerLinks = driver.findElements(By.cssSelector("ul.sc-f116bf72-2.bXpjTY>li")); //call the list again
			Thread.sleep(2000);
		}
	}

}
