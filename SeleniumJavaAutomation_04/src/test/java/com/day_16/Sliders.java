package com.day_16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sliders {

	@Test
	public void Sliders_Windows() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min_silder=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Location of the MIN slider before moving : "+min_silder.getLocation());

		Actions ac=new Actions(driver);
		ac.dragAndDropBy(min_silder,100,249).perform();
		System.out.println("Location of the MIN slider after moving : "+min_silder.getLocation());

		WebElement max_silder=driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
		System.out.println("Location of the MAX slider after : "+max_silder.getLocation());
		
		ac.dragAndDropBy(max_silder,-180,249).perform();
		System.out.println("Location of the MAX slider before : "+max_silder.getLocation());

		Thread.sleep(5000);
		driver.quit();
	}
}