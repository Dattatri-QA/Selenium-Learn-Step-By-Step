package com.day_07;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBrowserWindows {

	@Test
	public void HandleBrowserWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> winodw = driver.getWindowHandles();

		// Appoach1
		/*
		 * List<String> WindowList = new ArrayList(winodw); String parentID =
		 * WindowList.get(0); String childID = WindowList.get(1);
		 * 
		 * driver.switchTo().window(childID); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(parentID); System.out.println(driver.getTitle());
		 */

		// Appoach2
		for (String winID : winodw) {
			String title = driver.switchTo().window(winID).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

		driver.quit();

	}
}
