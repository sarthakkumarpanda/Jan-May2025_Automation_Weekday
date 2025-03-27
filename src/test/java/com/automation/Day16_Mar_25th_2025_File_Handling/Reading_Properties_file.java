package com.automation.Day16_Mar_25th_2025_File_Handling;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reading_Properties_file {
	
	//Step 1: Create the .properties file
	//Step 2: Pass the data in form of key-value in the properties file
	//Step 3: Create the object of Properties Class
	//Step 4: Create the object of FileInputStream Class and pass the path of the properties file in the constructor
	//Step 5: Load the file
	//Step 6: In automation code, we use the reference of the Properties class and utilize the key in the automation code
	
	//Step 0: Create the Constructor
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	public Reading_Properties_file() throws Exception {
		prop = new Properties();
	    ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day16_Mar_25th_2025_File_Handling\\Login.properties");
	    prop.load(ip);
	}
	

	
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test
	public void registerTest() {
		//Home Assignment
	}

}
