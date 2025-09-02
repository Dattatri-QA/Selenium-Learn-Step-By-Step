package com.day_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_Files {

	@Test
	public void Upload_Pages() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\DELL\\Downloads\\Selenium Interview Questions.pdf");

		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Selenium Interview Questions.pdf")) {
			System.out.println("File is uploaded succesfully");
		}else {

			System.out.println("File is uploaded failed");
		}

		Thread.sleep(5000);
		driver.quit();
	}
}