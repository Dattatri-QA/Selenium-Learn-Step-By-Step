package com.day_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation_Commands {

	@Test
	public void Navigation_Command() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://www.browserstack.com/guide/fluentwait-selenium");
		// URL url = new URL("https://www.browserstack.com/guide/fluentwait-selenium");
		// driver.navigate().to(url);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.browserstack.com/guide/fluentwait-selenium");

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

		driver.quit();
	}

}
