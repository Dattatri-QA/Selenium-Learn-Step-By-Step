package com.day_14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Handling_Date_Pickers {

	@Test
	public void Date_Pickers() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);

		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/10/2025");

		String year="2026";
		String month="October";
		String date="10";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
			String currectMonth=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currectyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(currectMonth.equals(month)&&currectyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for(WebElement dat:allDates) {
			if(dat.getText().equals(date)) {
				dat.click();
				break;
			}
		}



		Thread.sleep(5000);
	driver.quit();

	}
}