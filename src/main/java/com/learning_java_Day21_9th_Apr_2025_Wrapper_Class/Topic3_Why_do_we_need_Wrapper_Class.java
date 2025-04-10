package com.learning_java_Day21_9th_Apr_2025_Wrapper_Class;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic3_Why_do_we_need_Wrapper_Class {
	
	
	//When we use Collection Framework
	//To convert the primitive data type into Objects and vice versa

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
	}
	
	
	public static void seleniumCode() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Determine all the WebElements which have div as the html tag
		
		List<WebElement> divtags = driver.findElements(By.tagName("div")); //you are collecting WebElements. What are these WebElements. These are Objects
		
	}

}
