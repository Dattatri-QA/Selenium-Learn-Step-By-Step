package com.day_10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDrop_Downs {

	@Test
	public void Drop_DownsList() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCoutry = new Select(drpCountryEle);

		// drpCoutry.selectByVisibleText("China");
		// drpCoutry.selectByValue("uk");
		// drpCoutry.selectByIndex(5);

		List<WebElement> options = drpCoutry.getOptions();
		System.out.println("NUmber of option in that : " + options.size());

		/*for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		 */
		for(WebElement op:options) {
			System.out.println(op.getText());
		}


		Thread.sleep(10000);
		driver.quit();

	}

}
