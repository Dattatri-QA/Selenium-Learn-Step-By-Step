package com.day_24;

import org.testng.annotations.Test;

public class SignOffTest {

	@Test(priority = 1,groups = {"regression"})
	void signubyEmail() {
		System.out.println("This is sign by email...");

	}
	@Test(priority = 2,groups = {"regression"})
	void signubyFacebook() {
		System.out.println("This is sign by facebook...");
	}
	@Test(priority = 3,groups = {"regression"})
	void signubyInsta() {
		System.out.println("This is sign by insta...");
	}
}