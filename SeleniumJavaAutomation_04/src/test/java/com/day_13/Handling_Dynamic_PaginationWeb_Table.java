package com.day_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Dynamic_PaginationWeb_Table {

	@Test
	public void Handling_Dynamic_PaginationWeb() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();

		String pageText=	driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages=Integer.parseInt(pageText.substring(pageText.indexOf("(")+1,pageText.indexOf("Pages")-1));
		System.out.println(total_pages);

		int noRowls=	driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		for(int r=1;r<=noRowls;r++) {
			String CustomerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			String EmailID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[7]")).getText();
			System.out.println(CustomerName+"\t"+EmailID+"\t"+status);
			
		}

		Thread.sleep(5000);
		driver.quit();
	}
}