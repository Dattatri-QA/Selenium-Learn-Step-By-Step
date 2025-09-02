package com.day_17;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zooming_Zoomout {

	@Test
	public void Zoom_Pages() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(5000);
		driver.quit();
	}
}