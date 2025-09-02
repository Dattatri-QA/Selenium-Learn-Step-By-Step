package com.day_06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpliciWaitDemo {

	WebDriver driver;
	WebDriverWait wait;
	WebElement textusername;
	WebElement password;
	WebElement login;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void ExpliciWait() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get(url);

		textusername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		textusername.sendKeys("Admin");

		password = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");

		login = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
		login.click();
		
		driver.quit();
	}
}
