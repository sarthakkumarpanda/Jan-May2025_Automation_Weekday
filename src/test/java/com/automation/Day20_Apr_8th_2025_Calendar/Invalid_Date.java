package com.automation.Day20_Apr_8th_2025_Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invalid_Date {
	
	//30th Feb 2027 - customized date
	
	public WebDriver driver;
	
	@Test
	public void pickthedate() throws Exception {
		customizedDate("29", "February", "2032");
	}
	
	public boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	@Test
	public void customizedDate(String selectday, String selectmonth, String selectyear) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		int day = Integer.parseInt(selectday);
		int yearInt = Integer.parseInt(selectyear);

		if (day > 31) {
		    System.out.println("Invalid Date");
		    return;
		} else if (selectmonth.equals("February")) {
		    if (day > 29) {
		        System.out.println("Invalid February Date");
		        return;
		    } else if (day == 29 && !isLeapYear(yearInt)) {
		        System.out.println("29th Feb is invalid in a non-leap year");
		        return;
		    }
		}
		
        String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals(selectmonth) && year.equals(selectyear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
		Thread.sleep(2000);
		String xpathdaytext = "//td[@data-handler='selectDay']/a[text()='" + selectday + "']";
		
		try {
			driver.findElement(By.xpath(xpathdaytext)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
