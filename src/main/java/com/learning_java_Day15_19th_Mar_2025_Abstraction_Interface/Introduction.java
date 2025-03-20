package com.learning_java_Day15_19th_Mar_2025_Abstraction_Interface;

public interface Introduction {
	
	     //100% abstraction
	
		//interface is defined as Blueprint of a Class
		//it tells a Class what to do but does not tell how to do
		
		//methods inside an interface are abstract and public. You need not use the keyword abstract in an interface
		
		//variables inside an interface are public, static and final
	
	public static final int i = 10;
	
	//jdk8 and onwards default concrete/normal methods were allowed
	//jdk9 and onwards private concrete methods were allowed
	//jdk8 and onwards static concrete methods were allowed
	
	public void secretSafe();
	
	public void landPapers();
	
	public void secretSanta();
	
	default public void check() {
		
	}
	 
	
	
	

}
