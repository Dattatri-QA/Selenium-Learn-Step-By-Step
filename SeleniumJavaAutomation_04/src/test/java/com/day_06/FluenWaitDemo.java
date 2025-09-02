package com.day_06;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluenWaitDemo {
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void FluenWait() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		Wait<WebDriver> wait = new FluentWait<>(driver)

				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example")));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.quit();
	}
}
