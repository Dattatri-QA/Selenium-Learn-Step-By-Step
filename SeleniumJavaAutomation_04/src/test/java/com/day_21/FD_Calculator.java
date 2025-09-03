package com.day_21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FD_Calculator {

	@Test
	public void FD_Calc() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		String filePath=System.getProperty("user.dir")+"\\TestData\\Cal.xlsx";
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");

		for(int i=1;i<=rows;i++) {

			String pric=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofinterest=ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1=ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2=ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre=ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);

			Select peroiddrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			peroiddrp.selectByVisibleText(per2);

			Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByIndex(4);

			driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();

			String act_mvalue=driver.findElement(By.xpath("//*[@id='resp_matval']//strong")).getText();

			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) {
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}else {
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1",i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}

		Thread.sleep(5000);
		driver.quit();
	}
}