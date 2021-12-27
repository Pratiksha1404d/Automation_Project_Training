package com.generic;

public class TestExcelFile {

	public static void main(String[] args) {
		
		
		ExcelFileReader.loadExcelFile(System.getProperty("user.dir")+"/src/main/resources/Resources/Excel/ExcelForSelenium.xlsx", "TC_01");
		String strTestdata="";
		
		for(int intRow=0; intRow<2; intRow++){
			
			for(int intColm=0; intColm<2; intColm++) {
				
				strTestdata=ExcelFileReader.getCellDataFromExcel(intRow,intColm);
				System.out.println("print test data----->"+strTestdata);
			}
		}
		 System.out.println("-------------------------------------------------------------");
         
		 System.out.println("Excel Data>>>>>"+ExcelFileReader.getCellDataFromExcel(1,2));
	}

}
