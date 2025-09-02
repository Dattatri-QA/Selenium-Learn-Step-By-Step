package com.day_18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {

	@Test
	public void Headless_Test() throws Throwable {

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless=new");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("nopCommerce demo store.Home page title")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}