package com.day_18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots_Page {
	@Test
	public void Screenshots() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/");

		/*TakesScreenshot take=(TakesScreenshot) driver;
		File sourcefile=take.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);

		WebElement product=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
		File sourcefile=product.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\productpages.png");
		sourcefile.renameTo(targetfile);*/


		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\logopages.png");
		sourcefile.renameTo(targetfile);

		Thread.sleep(5000);
		driver.quit();
	}
}