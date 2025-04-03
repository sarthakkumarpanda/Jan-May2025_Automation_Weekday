package com.automation.Day19_Apr_2nd_2025_Actions_Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Keyboard_Actions {
	
	public WebDriver driver;
	
	@Test
	public void loginTutorialsNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("My Account"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Login"))).click().build().perform();
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		actions.click(emailTextBox).sendKeys("seleniumpanda@gmail.com").build().perform();
		//I want to copy the whole email which is entered in the email text box
		
		//[Ctrl + A] Select All 
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//[Ctrl + C] Copying
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Press the TAB key
		//actions.keyDown(emailTextBox, Keys.TAB).keyUp(Keys.TAB).build().perform();
		actions.keyDown(emailTextBox, Keys.TAB).build().perform();
		
		//[Ctrl + V] Pasting
		actions.keyDown(passwordTextBox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Hit Enter key to click on Login Button
		actions.keyDown(loginButton, Keys.ENTER).build().perform();
		
	    
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
