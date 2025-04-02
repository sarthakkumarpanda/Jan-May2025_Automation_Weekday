package com.learning_java_Day18_1st_Apr_2025_Encapsulation;

public class Circle {
	
	private int radius;
	private double pivalue;
	
	
	public void setAreaOfACircle(int radius, double pivalue) {
		this.radius = radius;
		this.pivalue = pivalue;
	}
	
	
	public double getAreaOfCircle() {
		double area = pivalue * (radius * radius);
		System.out.println("The area of the circle is : " + area);
		return area;
	}

}
