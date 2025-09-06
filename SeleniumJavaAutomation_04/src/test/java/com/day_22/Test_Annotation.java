package com.day_22;

import org.testng.annotations.Test;

public class Test_Annotation {

	@Test(priority = 1)
	void OpenApp() {

		System.out.println("Opening application");
	}
	@Test(priority = 2)
	void LoginPage() {
		System.out.println("Login to application");
	}
	@Test(priority = 3)
	void LououtPage() {
		System.out.println("Logout from application");
	}

}
