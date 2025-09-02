package com.day_20;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {

	@Test
	public void ReadingDataExcel() throws Throwable{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");

		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();

		System.out.println("Total of Rows : "+totalRows);
		System.out.println("Total of Celss : "+totalCells);

		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow=sheet.getRow(r);

			for(int c=0;c<totalCells;c++) {
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}