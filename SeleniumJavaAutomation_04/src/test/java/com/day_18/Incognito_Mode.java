package com.day_18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incognito_Mode {

	@Test
	public void Incognito_Mode_Browser() {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/");
		String title=driver.getTitle();
		System.out.println(title);

	}
}

