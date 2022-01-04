package com.generic;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	
	public void loadExcelFile(String excelFilePath, String strSheetName){
		try {
			FileInputStream excelFile = new FileInputStream(excelFilePath);
			
	//		HSSFWorkbook workbook = new HSSFWorkbook(excelFile);
	//		HSSFSheet  excelsheet = workbook.getSheet(strSheetName);
			
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
			XSSFSheet excelsheet=workbook.getSheet(strSheetName);
			
			XSSFCellStyle style = excelsheet.getRow(1).getCell(1).getCellStyle();  // orange
		 // XSSFCellStyle style = excelsheet.getRow(28).getCell(3).getCellStyle();  // pink 
			
			String color =style.getFillForegroundColorColor().getARGBHex();
			
			if(color.equals("FFA500"))  // hexa code for orange
		    {	
			System.out.println("Color: orange "+color); 
		 	}
		    else if (color.equals("FFFFC0CB"))     //hexa code for pink
		    { 
		    	System.out.println("Color: pink " +color);  
		    }
			
//		System.out.println("color:"+style.getFillForegroundColorColor().getARGBHex());
		} catch (Exception exception) {
			System.out.println("While loading excel getting error :"+exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	
	

}
