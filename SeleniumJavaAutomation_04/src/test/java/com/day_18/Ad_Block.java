package com.day_18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ad_Block {

	
	@Test
	public void Ad_Block_Browser() {

		ChromeOptions option=new ChromeOptions();
		File file=new File("C:\\file\\SelectorsHub-Chrome-Web-Store.crx");
		option.addExtensions(file);

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://text-compare.com/");
		String title=driver.getTitle();
		System.out.println(title);
}
}