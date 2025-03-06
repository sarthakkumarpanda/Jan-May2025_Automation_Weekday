package com.automation.Day11_Mar_5th_2025_Validation_Techniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Money_Page_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus";
		String actualCurrentURL = driver.getCurrentUrl();
		System.out.println(actualCurrentURL);
		String expectedCurrentURL = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentURL.equals(expectedCurrentURL)) {
			driver.findElement(By.linkText("Money")).click();
			
			String moneyPageActualTitle = driver.getTitle();
			System.out.println(moneyPageActualTitle);
			String moneyPageExpectedTitle = "BSE: 73,730.23 | NSE: 22,337.30 - Live Stock Market | Share Prices | Mutual Fund India | Stock Market: Stock Market Today | Share Market Today - Rediff MoneyWiz";
			
			String moneyPageActualURL = driver.getCurrentUrl();
			System.out.println(moneyPageActualURL);
			String moneyPageExpectedURL = "https://money.rediff.com/index.html?_gl=1*2wpol6*_ga*MTE1NDg4MDg1NS4xNzQxMjI2ODMw*_ga_3FM4PW27JR*MTc0MTIyNjgzMC4xLjAuMTc0MTIyNjgzMS4wLjAuMA..";
			
			   if(moneyPageActualTitle.equals(moneyPageExpectedTitle) && moneyPageActualURL.equals(moneyPageExpectedURL)) {
				   System.out.println("So far my code is good");
			   }else {
				   System.out.println("My code is incorrect");
			   }
			
		}else {
			System.out.println("The title and currentURL are incorrect");
		}
		
		driver.quit();

	}

}
