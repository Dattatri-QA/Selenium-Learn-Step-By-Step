package com.day_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_Demo {
	@Test
	public void main() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		// name
		// driver.findElement(By.name("search")).sendKeys("phones");

		// id
		// boolean displayed = driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println(displayed);

		// linkText
		// driver.findElement(By.linkText("Laptops & Notebooks")).click();

		// partialLinkText
		// driver.findElement(By.partialLinkText("Laptop & Notebooks")).click();

		// className
		// List<WebElement> headerLinks =
		// driver.findElements(By.className("list-inline"));
		// System.out.println("Total of Links:" + headerLinks.size());

		// tagName
		// List<WebElement> Links = driver.findElements(By.tagName("a"));
		// System.out.println(Links.size());

		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());

		driver.quit();

	}

}
