package com.day_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Static_Web_Table {

	@Test
	public void Static_Web_Tables() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://testautomationpractice.blogspot.com/");
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows in cloum : " + rows);

		int clos = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of cloum : " + clos);

		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		System.out.println("this which book name : "+bookname);

		String selenium=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println("please tell me which name is shwoing : "+selenium);
		System.out.println();


		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=clos;c++) {
				String values= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(values +"\t");
			}
			System.out.println();
		}
		System.out.println();

		for(int r=2;r<=rows;r++) {
			String AuthourName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(AuthourName);
			if(AuthourName.equals("Mukesh")) {
				String booknames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(booknames+"\t"+AuthourName);
			}
		}

		System.out.println();
		int total=0;
		for(int r=2;r<=rows;r++) {
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(Price);
		}
		System.out.println("Total Prices Book : "+ total);
		Thread.sleep(10000);
		driver.quit();
	}
}