package com.day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSS_Locator {
	@Test
	public void main() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("phones");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phones");
		// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("watches");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("watches");

		driver.quit();

	}

}
