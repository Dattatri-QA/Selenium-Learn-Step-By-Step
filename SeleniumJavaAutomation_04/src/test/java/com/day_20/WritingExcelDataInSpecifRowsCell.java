package com.day_20;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class WritingExcelDataInSpecifRowsCell {

	@Test
	public void WritingIntoExcelData() throws Throwable{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\dataRandom.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");

		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		cell.setCellValue("GoMatha");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File Is Created...");
	}
}