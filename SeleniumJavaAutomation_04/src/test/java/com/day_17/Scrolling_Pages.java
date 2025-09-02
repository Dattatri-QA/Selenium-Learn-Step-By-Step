package com.day_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_Pages {

	@Test
	public void scroll_Pages() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		WebElement about=driver.findElement(By.xpath("//a[normalize-space()='about']"));
		js.executeScript("arguments[0].scrollIntoView();",about);
		Thread.sleep(5000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));


		Thread.sleep(10000);
		driver.quit();
	}
}
