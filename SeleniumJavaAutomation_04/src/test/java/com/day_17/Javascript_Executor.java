package com.day_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript_Executor {


	@Test
	public void  Javascript_Executors() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputName=driver.findElement(By.xpath("//input[@id='name']"));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','vinayak')",inputName);

		WebElement ClickNew=driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));
		js.executeScript("arguments[0].click()",ClickNew);



		Thread.sleep(5000);
		driver.quit();;

	}
}
