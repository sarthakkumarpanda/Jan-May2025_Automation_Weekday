package com.automation.Day19_Apr_2nd_2025_Multiple_WebElements;

import java.io.IOException;
import java.util.List;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ResponseCode {
	
public WebDriver driver;
	
	@Test
	public void bbcHomePage() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		List<WebElement> headerLinks = driver.findElements(By.cssSelector("ul.sc-f116bf72-2.bXpjTY>li"));
		System.out.println("Total header links of BBC.com is :" + headerLinks.size());
		
		for(int i=0 ; i<headerLinks.size() ; i++) {
			//System.out.println(headerLinks.get(i).getText()+"----"+headerLinks.get(i).getDomAttribute("href"));
			
			String url = headerLinks.get(i).getDomAttribute("href");
			if (url == null || url.isEmpty()) {
			    System.out.println("Skipping: href is null for link text = " + headerLinks.get(i).getText());
			    continue;
			}
			//Assert.assertTrue(result, "invalid response code");
			
			headerLinks.get(i).click();
			System.out.println("The tile of the page is : " + driver.getTitle());
			//System.out.println("The response statement of this link is : " + result);
			
			driver.get("https://bbc.com");
			Thread.sleep(2000);
			
			headerLinks = driver.findElements(By.cssSelector("ul.sc-f116bf72-2.bXpjTY>li")); //call the list again
			Thread.sleep(2000);
		}
	}
	
	public boolean validateResponseCode(String url) throws Exception, IOException {
		//our intention is if the response code == 200 then only perform operation on that link
		
		int response_code = 0;
		response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		if(response_code == 200) {
			return true;
		}
		
		return false;
	}

}
