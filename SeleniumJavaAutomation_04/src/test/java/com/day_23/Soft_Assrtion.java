package com.day_23;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assrtion {


	//@Test
	void test_hardassertions() {

		System.out.println("Testing........");
		System.out.println("Testing........");
		assertEquals(1, 2);

		System.out.println("testing........");
		System.out.println("testing........");
		assertEquals(2, 2);
	}
	@Test
	void test_softassertion() {
		System.out.println("Testing........");
		System.out.println("Testing........");
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(1, 2);

		System.out.println("testing........");
		System.out.println("testing........");
		soft.assertAll();
	
	}

}
