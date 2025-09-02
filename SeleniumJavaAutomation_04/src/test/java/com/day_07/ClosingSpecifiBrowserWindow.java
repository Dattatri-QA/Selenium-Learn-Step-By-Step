package com.day_07;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClosingSpecifiBrowserWindow {

	@Test
	public void ClosingBrowserWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> winodwID = driver.getWindowHandles();
		for (String winiID : winodwID) {
			String title = driver.switchTo().window(winiID).getTitle();
			System.out.println(title);

			if (title.equals("OrangeHRM")) {
				driver.close();
			}
		}

	}

}
