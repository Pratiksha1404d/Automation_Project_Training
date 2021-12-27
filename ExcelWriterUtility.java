package com.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterUtility {
	
	//Step 1.create Workbook
    private static XSSFWorkbook workBook;

    //Step 2.create or get sheet
    private static XSSFSheet excelSheet;


    public static void loadExcelFile(String excelFilePath,String strSheetName)
    {

        try {
            FileInputStream excelFile=new FileInputStream(excelFilePath);
            workBook=new XSSFWorkbook(excelFile);
            excelSheet=workBook.getSheet(strSheetName);

        } catch (Exception e) {

            System.out.println("While loading excel getting error >>"+e.getMessage());
            e.printStackTrace();
        }

    }

    public static void setCellDataToExcel(String excelFilePath,int rowNum,int cellNum,String value)
    {
        try {
            FileOutputStream excelFile=new FileOutputStream(excelFilePath);
            excelSheet.getRow(rowNum).createCell(cellNum).setCellValue(value);
            workBook.write(excelFile);

        } catch (Exception e) {
            System.out.println("Getting error while writing data >>"+e.getMessage());
            e.printStackTrace();

        }
    }

}


