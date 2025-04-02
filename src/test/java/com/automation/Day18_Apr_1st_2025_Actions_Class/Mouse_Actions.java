package com.automation.Day18_Apr_1st_2025_Actions_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Actions {

	// Click
	// Click and Hold
	// Click and Release
	// Contect click - Right click
	// Back Click
	// Forward Click
	// Double Click
	// Move To Element
	// Move by Offset
	// Drag and Drop

	// Rules to use Actions class
	// Rule 1: Create the object of the Actions Class
	// Rule 2: You have to pass the driver reference in the constructor in Actions
	// Rule 3: When you perform any mouse action, you have to supplement the code
	// with a method chaining of perform()

	public WebDriver driver;

	@Test
	public void mouseActionsOperations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");

		Actions actions = new Actions(driver);
		WebElement loginOrSignUpButton = driver.findElement(By.cssSelector("a._btnclick>span"));
		actions.moveToElement(loginOrSignUpButton).perform();

		WebElement customerLoginOption = driver.findElement(By.cssSelector("span#shwlogn > span:nth-child(1)"));
		actions.moveToElement(customerLoginOption).click().build().perform();

	}

	@Test(priority = 2)
	public void DragAndDrop() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Actions actions = new Actions(driver);
		//First need to determine how many frames are there
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames are : " + totalFrames.size());
		
		driver.switchTo().frame(0);
		WebElement dragElement  = driver.findElement(By.id("draggable"));
		actions.dragAndDropBy(dragElement, 200, 0).build().perform();

	}
	
	@Test(priority=3)
	public void dragAndDropForTwoEntities() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions actions = new Actions(driver);
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames are : " + totalFrames.size());
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, destination).build().perform();
	}

}
