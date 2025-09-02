package com.day_20;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingDynamicDataToExcel {

	@Test
	public void DynamicDataToExcel() throws Throwable{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Dynamicdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows...?");
		int noOfrows=sc.nextInt();

		System.out.println("Enter how many celss...?");
		int noOfcelss=sc.nextInt();

		for(int r=0;r<=noOfrows;r++) {
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<noOfcelss;c++) {
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File Is Created...");
	}
}