package com.automation.Day19_Apr_2nd_2025_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Handling_Multiple_Elements {
	
	public WebDriver driver;
	
	@Test
	public void bbcDotCom() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		//Find out total number of links present at this moment
		//Each link is a WebElement. They are objects
		
	    List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links are : " + totalLinks.size()); //as of 6:45 pm EST - it is 164
	    
	    //ok determine the 101st link
	    //101st link will be stored in the 100th index position
	    WebElement link101 = totalLinks.get(100);
	    System.out.println("The 101st link at this moment is :" + link101);
	    //Print whatever the 101st link has to say
	    System.out.println("The text of the 101st link at this moment is : " + link101.getText());
	    //This link will have a URL. Determine the URL present in the 101st link
	    System.out.println("The url present in link101 is :" + link101.getDomAttribute("href")); //getAttribute() method has been deprecated
	    //Determine the x and y coordinate of the 101st link
	    System.out.println(link101.getLocation().x + "--------------" + link101.getLocation().y);
	    
	    //There were 164 links. Print their respective names(text) along with the URL they hold along with the proof they are displayed or not
	    
	    for(int i=0 ; i<totalLinks.size() ; i++) {
	    	System.out.println(totalLinks.get(i).getText()+ "-------" + totalLinks.get(i).getDomAttribute("href")+"---"+totalLinks.get(i).isDisplayed());
	    }
	    
	    //Out of these so many links, click on it
	    link101.click();
	     
		
	}
	
	//HOME ASSIGNMENT
	
	@Test
	public void accumulateLinks() {
		//accumulate these links which come in the output console at some place else and use that someplace else as date store
		//click on each link from the data store 
	}

}
