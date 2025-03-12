package com.automation.Day12_Mar_11th_2025_XPATHs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic7_AdvancedXpaths_Example {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//li[@class = 'logo']/child::a/child::img
		//li[@class = 'logo']/descendant::img[1]
		//ul[@id = 'first-level-nav']/descendant::img[1]
		//div[@id = 'banner_android']/following-sibling::nav/descendant::img[1]
		//div[@id = 'banner_android']/following-sibling::nav[@id = 'nav-website']/descendant::img[1]
		//div[@id = 'banner_android']/following::ul[@id = 'first-level-nav']/descendant::img[1]
		//div[@id = 'footer-website']/preceding-sibling::nav/descendant::img[1]
		//div[@id = 'footer-website']/preceding::li[@class = 'logo']/descendant::img
		
		//li[@class = 'logo']/descendant::*
		//li[@class = 'logo']/parent::*
		//li[@class = 'logo']/child::*
		//li[@class = 'logo']/ancestor::*

	}

}
