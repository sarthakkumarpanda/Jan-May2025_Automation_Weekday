package com.automation.Day10_Mar_4th_2025_Automation_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_Basics_Automation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Ctrl + Shift + O = = importing packages
		//Command + Shift + O = importing packages
		
		//WebDriver is an interface in Java
		//ChromeDriver is a Class in java
		//driver is the reference variable
		//new ChromeDriver() is the object of the ChromeDriver Class
		
		//WebDriver interface is referring the object of ChromeDriver Class with the help of 
		//reference variable driver
		//So driver will control everything in this code
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
		
		

	}

}
