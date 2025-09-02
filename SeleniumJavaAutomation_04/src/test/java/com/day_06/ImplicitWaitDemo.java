package com.day_06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo {
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void ImplicitWait() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.quit();
	}
}
