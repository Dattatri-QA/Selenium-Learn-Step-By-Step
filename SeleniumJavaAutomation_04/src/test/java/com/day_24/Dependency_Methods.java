package com.day_24;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Dependency_Methods {

	@Test(priority = 1)
	void openapp() {
		assertTrue(false);
	}
	@Test(priority = 2,dependsOnMethods = {"openapp"})
	void login() {
		assertTrue(true);
	}
	@Test(priority = 3,dependsOnMethods = {"openapp","login"})
	void search() {
		assertTrue(true);
	}
	@Test(priority = 4)
	void advsearch() {
		assertTrue(true);
	}
	@Test(priority = 5)
	void logout() {
		assertTrue(true);
	}
}
