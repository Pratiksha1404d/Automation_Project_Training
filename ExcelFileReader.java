package com.generic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	
	private static XSSFWorkbook workbook;     //create workbook
	
	private static XSSFSheet excelsheet;      //create sheet
	
	private static XSSFRow row;               //create or get row
	
	private static XSSFCell cell;            //create or get cell
	
	
	public static void loadExcelFile(String excelFilePath, String strSheetName){
		try {
			FileInputStream excelFile = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(excelFile);
			excelsheet=workbook.getSheet(strSheetName);
			
		} catch (Exception exception) {
			System.out.println("While loading excel getting error >>"+exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public static String getCellDataFromExcel(int rowNum,int colmNum){
		try {
			cell= excelsheet.getRow(rowNum).getCell(colmNum);
			String strCellData = cell.getStringCellValue();
			return strCellData;
			
		} catch (Exception e) {
			System.out.println("getting error while reading the excel data >>");
			
			return "";
		}
		


	}
	

}
