package com.automation.Day11_Mar_5th_2025_Validation_Techniques_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validation_WebPage_Level {

	public static void main(String[] args) {
		// to check whether the url I am entering is the correct url
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//Title of the webpage - this is the first validation
		//Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus";
		
		//CurrentUrl of the webpage - this is 2nd validation
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualURL.equals(expectedURL)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("The title and current url of Rediff Landing Page are incorrect");
		}
		
		

	}

}
