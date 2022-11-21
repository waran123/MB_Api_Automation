package com.qa.medibuddy.api.datasupplier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider(name = "TestData")
	public static String[][] TestData() throws IOException {
	
		File excelfile = new File("./src/test/resources/ExcelData.xlsx");
		//System.out.println(excelfile.exists());

		FileInputStream fis = new FileInputStream(excelfile);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows()); // retrieve no of rows
		System.out.println(sheet.getLastRowNum()); // retrieve the rows without header 

		int noOfRow = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String [noOfRow -1 ][noOfColumns -1];
		for(int i = 0 ; i < noOfRow-1; i++) {
			for (int j =0 ; j< noOfColumns ; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = (df.formatCellValue(sheet.getRow(i+1).getCell(j)));
			}

		}

		workbook.close();
		fis.close();

		/*for ( String[] dataArr : data ) {
			System.out.println(Arrays.toString(dataArr));

		}*/
		
		return data ; 

	}

}
