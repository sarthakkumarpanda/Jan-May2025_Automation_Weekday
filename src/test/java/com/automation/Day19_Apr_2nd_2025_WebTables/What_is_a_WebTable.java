package com.automation.Day19_Apr_2nd_2025_WebTables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class What_is_a_WebTable {
	
	//it is a dynamic table which represents data in the form of rows and cols
	//Criteria to work with webtable - xpath and cssSelector knowledge should be strong
	
	//table is the parent
	//thead and tbody are the children of table
	
	//thead - represents the whole head
	//      - tr represents the row of the head
	//      - th represents each col present in the row. So technically tr is the parent of all the th's
	
	//tbody - represents the whole body
	//      - tr represents each row present in the body
	//      - td represents each col present in the row. So techically tr is the parent of all the td's
	
	//table[@class = 'dataTable'] - this represents the whole WebTable which includes the top header and the full body
	//table[@class = 'dataTable']/thead - this represents the whole Header but it excludes the Body
	//table[@class = 'dataTable']/tbody - this represents the whole Body but it excludes the Header
	//table[@class = 'dataTable']/thead/tr - this represents the complete row of the header
	//table[@class = 'dataTable']/thead/tr/th - this represents all the cols present in the Header row
	//table[@class = 'dataTable']/thead/tr/th[4] - this represents the 4th col of the Header row
	
	
	//table[@class = 'dataTable']/tbody - this represents the whole body without the header
	//table[@class = 'dataTable']/tbody/tr - this represents total no of rows in the body as of today - 2715
	//table[@class = 'dataTable']/tbody/tr[1] - this represents the first row of the body
	//table[@class = 'dataTable']/tbody/tr[1]/td - this represents all the cols of the 1st row of the body
	//table[@class = 'dataTable']/tbody/tr[35]/td[4] - this represents 35th row's 4th col of the body
	//table[@class = 'dataTable']/tbody/tr/td[1] - this represents all the cols present in the 1st col of the body
	//table[@class = 'dataTable']/tbody/tr/td[4] - this represents all the cols present in the 4th col of the body
	
	
	public WebDriver driver;
	@Test
	public void printAllColumnNamesOfHeaderRow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> namesOfColsOfHeaderRow = driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th"));
		for(int i=0 ; i<namesOfColsOfHeaderRow.size() ; i++) {
			System.out.println(namesOfColsOfHeaderRow.get(i).getText());
		}
		
	}
	
	@Test
	public void printAnIndividualColInHeaderRow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		//I decided to chose 3rd col
		WebElement thirdCol = driver.findElement(By.xpath("//table[@class = 'dataTable']/thead/tr/th[3]"));
		System.out.println(thirdCol.getText());
		
	}
	
	@Test
	public void printAllRowsOfBody() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr"));
		for(int i=0 ; i<allRows.size() ; i++) {
			System.out.println(allRows.get(i).getText());
		}
	}
	
	@Test
	public void printAllColsOFTheFirstRowOftheBody() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> firtRowCols = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[1]/td "));
		for(int i=0 ; i<firtRowCols.size() ; i++) {
			System.out.println(firtRowCols.get(i).getText());
		}
	}
	
	@Test
	public void identifyCurrentPriceOfShivaCement() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		String companyName = "Shiva Cement";
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		for(int i=0 ; i<companyNames.size() ; i++) {
			if(companyName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText()+"-------------"+ currentPrices.get(i).getText());
				break;
			}
		}
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
