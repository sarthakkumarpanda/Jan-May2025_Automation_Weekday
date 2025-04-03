package com.automation.Day19_Apr_2nd_2025_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Flipkart {
	
	public WebDriver driver;

	@Test
	public void flipKart() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-formal-shirts/pr?sid=clo,ash,axc,mmk,bk1&fm=neo%2Fmerchandising&iid=M_d4682bd9-4635-4892-952e-61ff40a89502_1_372UD5BXDFYS_MC.V795R35ST9K6&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Fashion~Men%27s%2BTop%2BWear~Men%27s%2BFormal%2BShirts_V795R35ST9K6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=V795R35ST9K6");
	
	
	//name - price - discount
		
		List<WebElement> brandname = driver.findElements(By.className("syl9yP"));
		List<WebElement> discount = driver.findElements(By.className("UkUFwK"));
		List<WebElement> price = driver.findElements(By.className("Nx9bqj"));
		
		for(int i=0 ; i<brandname.size() ; i++) {
			System.out.println(brandname.get(i).getText() + "---" + discount.get(i).getText()+ "---" + price.get(i).getText());
		}
	}
	
	//HOME ASSIGNMENT
	
	@Test
	public void eliminateCommonBrandNames() {
		//choose brandnames which are repeated
		//choose brandnames which are unique
	}

}
