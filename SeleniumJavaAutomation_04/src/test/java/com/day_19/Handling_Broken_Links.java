package com.day_19;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Broken_Links {

	@Test
	public void Broken_Links() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+links.size());

		int noOfBrokenLinks=0;

		for(WebElement linkElement:links) {
			String herafAttValue=linkElement.getAttribute("href");
			if(herafAttValue==null || herafAttValue.isEmpty()) {
				System.out.println("herf attribute values is null or emty.so not possible to check");
				continue;
			}
			try {
				URL linkURL=new URL(herafAttValue);
				HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection();
				conn.connect();

				if(conn.getResponseCode()>=400) {
					System.out.println(herafAttValue +"======> Broken link");
					noOfBrokenLinks++;
				}else {
					System.out.println(herafAttValue +"======> Not A Broken link");
				}
			}
			catch (Exception e) {
			}
		}
		System.out.println("Number of broken links : "+noOfBrokenLinks);
		Thread.sleep(5000);
		driver.quit();
	}
}