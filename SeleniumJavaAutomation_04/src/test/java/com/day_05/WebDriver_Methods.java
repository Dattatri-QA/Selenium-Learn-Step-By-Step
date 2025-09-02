package com.day_05;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriver_Methods {
	@Test
	public void Methods() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource()); 
		// String windowID = driver.getWindowHandle();
		// System.out.println(windowID);

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);

		driver.quit();

	}

}
