package com.generic;

public class TestExcelWriterData {

	public static void main(String[] args) {
		
		
	         ExcelWriterUtility.loadExcelFile(System.getProperty("user.dir")+"/src/main/resources/Resources/Excel/ExcelForSelenium.xlsx","TC_01");
	         String src=System.getProperty("user.dir")+"/src/main/resources/Resources/Excel/ExcelForSelenium.xlsx";

	        ExcelWriterUtility.setCellDataToExcel(src,0,2,"Results");
	        for(int intRow=1;intRow<2;intRow++)
	        {
	                ExcelWriterUtility.setCellDataToExcel(src,intRow,3,"Fail");
	        }

	        System.out.println("Writing data completed");


	    }
	 
	

	}


