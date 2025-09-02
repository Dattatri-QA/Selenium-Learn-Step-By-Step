package com.day_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_Files_Copy {

	@Test
	public void Upload_Copy() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		String file1="C:\\Users\\DELL\\Downloads\\Selenium Interview Questions.pdf";
		String file2="C:\\Users\\DELL\\Downloads\\Quick Answers_ Multithreading.pdf";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

		int noOfFileSUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOfFileSUploaded==2) {
			System.out.println("File is OLD uploaded succesfully");
		}else {
			System.out.println("File is OLD uploaded failed");
		}

		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Selenium Interview Questions.pdf") && driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Quick Answers_ Multithreading.pdf"))
		{
			System.out.println("File is NEW uploaded succesfully");
		}else {

			System.out.println("File is NEW uploaded failed");
		}

		Thread.sleep(5000);
		driver.quit();
	}
}
