package com.automation.Day17_Mar_26th_2025_DataProvider_ExcelSheet;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProvider_ExcelCode {
	
	//Step 1: When we are using Excel Code, then we have to add certain libraries in our pom.xml file - POI Apache Libraries
	//Step 2: Create the .xslx file and insert all the data you need
	//Step 3: Close the Excel if it is open in your laptop
	//Step 4: Copy that Excel file and paste it inside the package in which you are writing the code
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellType celltype;
	
	//Step 5: Create a method which will define the logic of how you can use the date from your Excel File in Automation Coding
	public static Object[][] readFromExcelSheetLoginRediff(String sheetName) throws Exception {
	//Step 6: Create the Object of FileInputStream Class and pass the path of the Excel file in it's constructor
	ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day17_Mar_26th_2025_DataProvider_ExcelSheet\\ExcelData.xlsx");
	
	//Step 7: Create the Object of XSSFWorkbook and pass the FileInputStream reference in it's constructor
	workbook = new XSSFWorkbook(ip);
	
	//Step 8: Use the workbook reference to address the individual sheet
	sheet = workbook.getSheet(sheetName);
	
	//Step 9: We have to identify no of rows and cols
	int rows = sheet.getLastRowNum();
	int cols = sheet.getRow(0).getLastCellNum();
	
	//Step 10: Create a 2-D Object Array and then return the Object Array
	Object[][] data = new Object[rows][cols];
	
	for(int i=0 ; i<rows ; i++) {
		row = sheet.getRow(i+1);
		
		for(int j=0 ; j<cols ; j++) {
			cell = row.getCell(j);
		     celltype = cell.getCellType();
			 
			 switch(celltype) {
			 case STRING:
				 data[i][j] = cell.getStringCellValue(); //I do not need to change
				 break;
				 
			 case NUMERIC:
				  data[i][j] = Integer.toString((int)cell.getNumericCellValue()); //I want to change it to String
				  break;
				  
			 case BOOLEAN:
				 data[i][j] = cell.getBooleanCellValue();
				 break;
			 }
		}
	}
	return data;
	}
	
	/***************************************RegisterTN*******************************************************************/
	
	
	@DataProvider
	public Object[][] rediffData() throws Exception {
		Object[][] data = DataProvider_ExcelCode.readFromExcelSheetLoginRediff("LoginRediff");
	    return data;
	}
	
	
	
    public static Object[][] readFromExcelSheetRegisterTN(String sheetName) throws Exception {
    	ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day17_Mar_26th_2025_DataProvider_ExcelSheet\\ExcelData.xlsx");
    	workbook = new XSSFWorkbook(ip);
    	sheet = workbook.getSheet(sheetName);
    	int rows = sheet.getLastRowNum();
    	int cols = sheet.getRow(0).getLastCellNum();
    	
    	Object[][] data = new Object[rows][cols];
    	
    	for(int i=0 ; i<rows ; i++) {
    		row = sheet.getRow(i+1);
    		
    		for(int j=0 ; j<cols ; j++) {
    			cell = row.getCell(j);
    			 celltype = cell.getCellType();
    			 
    			 switch(celltype) {
    			 case STRING:
    				 data[i][j] = cell.getStringCellValue(); //I do not need to change
    				 break;
    				 
    			 case NUMERIC:
    				  data[i][j] = Integer.toString((int)cell.getNumericCellValue()); //I want to change it to String
    				  break;
    				  
    			 case BOOLEAN:
    				 data[i][j] = cell.getBooleanCellValue();
    				 break;
    			 }
    		}
    	}
    	return data;
    	}
    
    
    @DataProvider
	public Object[][] registerData() throws Exception {
    	Object[][] data = DataProvider_ExcelCode.readFromExcelSheetRegisterTN("RegisterTN");
	    return data;
	}
    
    /***************************************LoginTN*******************************************************************/
    
    public static Object[][] readFromExcelSheetLoginTN(String sheetName) throws Exception {
    	ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day17_Mar_26th_2025_DataProvider_ExcelSheet\\ExcelData.xlsx");
    	workbook = new XSSFWorkbook(ip);
    	sheet = workbook.getSheet(sheetName);
    	int rows = sheet.getLastRowNum();
    	int cols = sheet.getRow(0).getLastCellNum();
    	
    	Object[][] data = new Object[rows][cols];
    	
    	for(int i=0 ; i<rows ; i++) {
    		row = sheet.getRow(i+1);
    		
    		for(int j=0 ; j<cols ; j++) {
    			cell = row.getCell(j);
    			 celltype = cell.getCellType();
    			 
    			 switch(celltype) {
    			 case STRING:
    				 data[i][j] = cell.getStringCellValue(); //I do not need to change
    				 break;
    				 
    			 case NUMERIC:
    				  data[i][j] = Integer.toString((int)cell.getNumericCellValue()); //I want to change it to String
    				  break;
    				  
    			 case BOOLEAN:
    				 data[i][j] = cell.getBooleanCellValue();
    				 break;
    			 }
    		}
    	}
    	return data;
	}
	
	
	@DataProvider
	public Object[][] loginData() throws Exception {
		Object[][] data = DataProvider_ExcelCode.readFromExcelSheetLoginTN("LoginTN");
	    return data;
	}
	
	
	

}
