package com.automation.Day18_Apr_1st_2025_Application_of_OOPs_in_Automation;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public ChromeOptions options;
	
	
	public TestBase() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day18_Apr_1st_2025_Application_of_OOPs_in_Automation\\config.properties");
	    prop.load(ip);
	}
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if(browserName.equals("Chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			driver = new ChromeDriver(options);
		}else if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Browser does not exist in the Sytem");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(200));
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}

}
