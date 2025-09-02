package com.day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {

	@Test
	public void openWebsite() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		String title_1 = driver.getTitle();
		System.out.println("Page Title: " + title_1);

		String act_title = driver.getTitle();
		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		System.out.println("Page Title: " + act_title);

		driver.quit();
	}
}
