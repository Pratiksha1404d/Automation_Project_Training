package com.generic;

public class TestExcelReader {

	public static void main(String[] args) {

		ExcelFileReader objTestExcelFile = new ExcelFileReader();
		
		objTestExcelFile.loadExcelFile(System.getProperty("user.dir")+"/src/test/resources/downloads/Side By Side Compare Report_01032022  04-25-34-929.xlsx", "2022 SOT");
      
	}

}
 