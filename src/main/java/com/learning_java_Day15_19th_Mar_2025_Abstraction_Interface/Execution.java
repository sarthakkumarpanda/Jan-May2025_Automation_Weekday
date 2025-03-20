package com.learning_java_Day15_19th_Mar_2025_Abstraction_Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution implements Introduction, Conclusion {
	
	//when a Child class extends a Parent Class then inheritance is established. extends is the keyword of significance
	
	//when a class wants to establish inheritance with Interface, which keyword will be of significance ??  implements

	//Can a Class implement multiple interfaces ??? YES
	
	public static void main(String[] args) {
		
		//We cannot create the object of Abstract Class
		//Can we create the Object of an Interface ?? Absolutely Not
		
		//In Selenium library there are lot of pre-defined Interfaces.
		//These pre-defined interfaces have lot of abstract methods
		
		Introduction reference = new Execution();  //the reference of the Interface is pointing to the Object of the implementing Class
		
		Conclusion reference1 = new Execution();
		
		//WebDriver is a pre-defined interface
		
		WebDriver driver = new ChromeDriver(); //open the browser
		driver.manage().window().maximize(); //you can do method chaining
		

	}

	@Override
	public void secretSafe() {

		
	}

	@Override
	public void landPapers() {
	
		
	}

	@Override
	public void secretSanta() {
		
		
	}

	@Override
	public void openApplication() {
		
		
	}

	@Override
	public void manageApplication() {
	
		
	}

	@Override
	public void disconnectDB() {
		
		
	}

}
