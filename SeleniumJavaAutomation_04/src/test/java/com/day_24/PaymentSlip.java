package com.day_24;

import org.testng.annotations.Test;

public class PaymentSlip {

	@Test(priority = 1,groups = {"sanity","regression"})
	void paymentRupees() {
		System.out.println("payment in rupees...");
	}
	@Test(priority = 1,groups = {"sanity","regression"})
	void paymentInDollars() {
		System.out.println("payment in dollars...");

	}
}
