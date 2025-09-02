package com.day_18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSL {

	@Test
	public void SSL_Page() throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/");
		String title=driver.getTitle();
		System.out.println(title);

	}
}