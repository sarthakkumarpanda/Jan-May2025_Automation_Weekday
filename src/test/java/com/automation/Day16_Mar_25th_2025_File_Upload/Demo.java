package com.automation.Day16_Mar_25th_2025_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	public WebDriver driver;
	
	@Test
	public void uploadDemo() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.findElement(By.cssSelector("div.btn.btn-primary.btn-file > input")).sendKeys("C:\\Users\\sarth\\OneDrive\\Desktop\\Upload.xlsx");
		
		WebElement removebutton = driver.findElement(By.cssSelector("button.btn.btn-default.fileinput-remove.fileinput-remove-button"));
		Assert.assertTrue(removebutton.isDisplayed() && removebutton.isEnabled());
		removebutton.click();
		
		
	}

}
