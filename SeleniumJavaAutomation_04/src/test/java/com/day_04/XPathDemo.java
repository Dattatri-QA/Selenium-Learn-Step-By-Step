package com.day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathDemo {
	@Test
	public void xpathathDemo1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		// XPath with single attribute
		// driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("phones");

		// XPath with multiple attribute
		// driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search
		// store']")).sendKeys("phones");

		// XPath with text() -- inner text
		// driver.findElement(By.xpath("//*[text()='Apple MacBook Pro']")).click();

		// boolean product = driver.findElement(By.xpath("//*[.='Featured
		// products']/strong")).isDisplayed();
		// System.out.println(product);

		// String products = driver.findElement(By.xpath("//*[.='Featured
		// products']/strong")).getText();
		// System.out.println(products);

		// XPath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder ,'Sea')]")).sendKeys("books");

		// XPath with start with
		driver.findElement(By.xpath("//input[starts-with(@placeholder ,'Sea')]")).sendKeys("books");
		
		
		driver.quit();
	}

}
