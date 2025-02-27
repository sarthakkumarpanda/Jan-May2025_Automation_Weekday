package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Topic_Switch_Statement {
	
	public static void whatIsSwitch() {
		//switch statement is a multiway branch statement
		//switch statement defines multiple paths of execution of program
		//switch statement providers better alternation that a large series of if else
	}

	public static void main(String[] args) {
		whichDigitDenotesWhichMonth();

	}
	
	public static void determineViowels() {
		//this is your homework
	}
	
	public static void whichDigitDenotesWhichMonth() {
		int month = 9; 
		String monthName = "";
		
		switch(month) {
		
		case 1: monthName = "1 - January";
		break;
		
		case 2: monthName = "2 - Feb";
		break;
		
		case 3: monthName = "3 - Mar";
		break;
		
		case 4: monthName = "4 - Apr";
		break;
		
		case 5: monthName = "5 - May";
		break;
		
		case 6: monthName = "6 - June";
		break;
		
		case 7: monthName = "7 - July";
		break;
		
		case 8: monthName = "8 - Aug";
		break;
		
		case 9: monthName = "9 - Sep";
		break;
		
		case 10: monthName = "10 - Oct";
		break;
		
		case 11: monthName = "11 - Nov";
		break;
		
		case 12: monthName = "12 - Dec";
		break;
		
		default: System.out.println("Invalid month value");
		}
		
		System.out.println(monthName);
		
		
	}

}
