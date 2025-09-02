package com.day_08;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlerts {

	@Test
	public void HandleAlert() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Alert']")).click(); Alert
		 * Myalert = driver.switchTo().alert(); System.out.println(Myalert.getText());
		 * Myalert.accept();
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 * //driver.switchTo().alert().accept(); driver.switchTo().alert().dismiss();
		 */

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myJS=driver.switchTo().alert();
		Thread.sleep(4000);
		myJS.sendKeys("welcome");
		myJS.accept();
		Thread.sleep(4000);

		driver.quit();
	}
}
