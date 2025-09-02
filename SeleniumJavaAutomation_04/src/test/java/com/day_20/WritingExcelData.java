package com.day_20;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class WritingExcelData {

	@Test
	public void WritingIntoExcelData() throws Throwable{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Writedata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");

		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("01");
		row1.createCell(1).setCellValue("java");
		row1.createCell(2).setCellValue("selenium");
		row1.createCell(3).setCellValue("core java");

		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("02");
		row2.createCell(1).setCellValue("java with python");
		row2.createCell(2).setCellValue("selenium with java");
		row2.createCell(3).setCellValue("core java with c++");

		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("03");
		row3.createCell(1).setCellValue("AI Tool");
		row3.createCell(2).setCellValue("Project Testing");
		row3.createCell(3).setCellValue("Eclipse Tool");

		XSSFRow row4=sheet.createRow(3);
		row4.createCell(0).setCellValue("04");
		row4.createCell(1).setCellValue("Testing Jobs");
		row4.createCell(2).setCellValue("Data Jobs");
		row4.createCell(3).setCellValue("SQL Jobs");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File Is Created...");
	}
}