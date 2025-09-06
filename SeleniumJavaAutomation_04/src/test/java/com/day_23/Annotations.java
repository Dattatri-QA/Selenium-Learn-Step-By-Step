package com.day_23;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	void login() {
		System.out.println("This is login...");

	}
	@Test(priority = 1)
	void search() {
		System.out.println("This is logout..");

	}
	@Test(priority = 1)
	void adavcefSearch() {
		System.out.println("This is search...");

	}
	@AfterMethod
	void logout() {
		System.out.println("This is logout...");

	}

}
