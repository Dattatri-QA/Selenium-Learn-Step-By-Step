package com.day_08;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCheckboxes {

	@Test
	public void HandleCheckboxe() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://testautomationpractice.blogspot.com/");
		// driver.findElement(By.xpath("//input[@id='monday']")).click();

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		/*
		 * for (int i = 0; i < checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 * 
		 * for (WebElement checkbox : checkboxes) { checkbox.click(); }
		 * 
		 * 
		 * for (int i = 4; i < checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 */

		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(4000);

		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected())
				checkboxes.get(i).click();
		}
	}
}
