package com.automation.Day17_Mar_26th_2025_Wait_Conditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Types_Of_Wait {
	
	//1. implicitWait - it is very smart form of wait
	//2. explicitWait - it is very rigid
	//3. fluentWait - HomeAssignment
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void applyingImplicitWait() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //it applies to all Web Elements
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(200));
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(Duration.ofSeconds(5)); //this is wait of Java. Using this too much is not a good practice
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test
	public void applyingExplicitWait() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //it applies to all Web Elements
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(200));
		
		//First thing is you have to create the Object of WebDriverWait class
		//With the help of ExpectedConditions class you will utilize the unimplemented methods 
		//Generally explicit wait is used when a particular Web Element is misbehaving
		
		//elementToBeClickable()
		//visibilityOfElementLocated()
		//visibilityOfElementLocated()
		//presenceOfElementLocated()
		//titleContains(String)
		//alertIsPresent()
		 
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myaccountLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account")));
		myaccountLink.click();
		
	}

}
